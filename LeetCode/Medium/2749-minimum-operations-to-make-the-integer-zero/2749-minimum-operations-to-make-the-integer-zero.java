class Solution {
    public int makeTheIntegerZero(int num1, int num2) {

          for (int k = 1; k <= 60; k++) {
            
            long X = (long) num1 - (long) num2 * k;
            if (X < 0) continue;
            int pop = Long.bitCount(X);
            if (pop <= k && k <= X) return k;
        }
        return -1;



    }
}