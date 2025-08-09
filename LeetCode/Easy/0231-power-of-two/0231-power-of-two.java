class Solution {

    public boolean isPowerOfTwo(int n) {

    
  
    return n > 0 && (n & (n - 1)) == 0;    // here n-1 flips the bits from right 

    // n>0 checks for negetive number and neglect them 

    // and operation between both will give only 0 if it was power of two
    // because the who are power of two has only one set bit
    




  
    }
}