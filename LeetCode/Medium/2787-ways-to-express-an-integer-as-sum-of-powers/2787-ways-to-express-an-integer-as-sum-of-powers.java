class Solution {
    private static final int MOD = 1000000007;
    public int[][] dp;

    public int numberOfWays(int n, int x) {
        dp = new int[n+1][n+1];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return solve(n, x, 1);
    }

    private int solve(int remaining, int x, int base) {

        if (remaining == 0)
            return 1;

       
        if (Math.pow(base, x) > remaining)
            return 0;

        int power = (int) Math.pow(base, x);

        if (dp[remaining][base] != -1)
            return dp[remaining][base];

       
        int skip = solve(remaining, x, base + 1);

       
        int take = solve(remaining - power, x, base + 1);

       
        return dp[remaining][base] = (skip + take) % MOD;
    }
}