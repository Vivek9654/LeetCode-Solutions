class Solution {
    public int climbStairs(int n) {
      //iterative approach
        //  int step1= 1, step2=2;


        //  for(int i=3;i<=n;i++){
        //    int step3= step1+step2;
        //    step1= step2;
        //    step2= step3;

        //  }
        
        // return step2;


        // now i am doing it with dp



   int 
        int[] dp = new int[n+1];

        if(n==1) return 1;
       dp[1]=1;
       dp[2]=2;

       for(int i=3;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
       }
         return dp[n];
    }
}