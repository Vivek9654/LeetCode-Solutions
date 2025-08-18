// class Solution {
//     public boolean isPowerOfThree(int n) {
//         if(n<0) return false;
//         for(int i=0;i<n;i++){
//         int pow=(int)Math.pow(3,i);
//       if(pow==n) return true;
//         }
        
//         return false;
//     }
// }


class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
