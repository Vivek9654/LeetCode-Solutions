class Solution {
    public int[][] sortMatrix(int[][] grid) {

        //  arraylist version

        int rows = grid.length;
        int cols = grid[0].length;

        int totaldiag = rows + cols - 1;
        List<List<Integer>> diag = new ArrayList<>(totaldiag);

        //isitializing list
        for (int i = 0; i < totaldiag; i++) {
            diag.add(new ArrayList<>());

        }
      

      // addin elements of matrix to list

      


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
              int key=  i -j+(cols-1);
                diag.get(key).add(grid[i][j]);
            }
        }
        for (int key = 0; key < totaldiag; key++) {
            int startRow = Math.min(key, rows - 1);
            int startCol = key - startRow;

            if (key>=cols-1) {
                diag.get(key).sort(Comparator.reverseOrder()); // bottom-left
            } else {
                diag.get(key).sort(Comparator.naturalOrder()); // top-right
            }

        }

        //filling the array again 

        int[] index = new int[totaldiag];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int key = i -j+(cols-1);
                grid[i][j] = diag.get(key).get(index[key]);
                index[key]++;
            }
        }

        return grid;
    }
}