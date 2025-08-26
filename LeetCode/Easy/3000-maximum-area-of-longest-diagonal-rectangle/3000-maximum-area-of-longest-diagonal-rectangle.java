class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxD = 0;
        int maxA = 0;

        //here calculating diognal and area
        for (int[] d : dimensions) {
            int l = d[0], w = d[1];
            double diag = Math.sqrt(l * l + w * w);

            int area = l * w;
            // for finding max area and diagonal
            if (diag > maxD || (diag == maxD && area > maxA)) {
                maxD = diag;
                maxA = area;
            }
        }
        return maxA;
    }
}
