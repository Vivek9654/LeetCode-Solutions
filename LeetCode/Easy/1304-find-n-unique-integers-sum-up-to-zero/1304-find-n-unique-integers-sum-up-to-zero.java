class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];


      

            int index = 0;
           //check if number is ever or not
            if (n % 2 != 0) {
                result[index++] = 0;
            }  
            for (int i = 1; index < n; i++) {
                result[index++] = i;  
                if (index < n) {
                    result[index++] = -i;  
                }
            }
         
          
    
   
        return result;
    }

}