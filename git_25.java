class git_25{
    public int kInversePairs(int n, int k) {
        int[][] dp = new int[n + 1][k + 1];
        dp[0][0] = 1;
        int mod = 1000000007;

        for(int i = 1; i <= n; i++) {
            int val = 0;
            for(int j = 0; j <= k; j++) {
                val += dp[i - 1][j];
                if(j >= i) val -= dp[i - 1][j - i];
                if(val < 0) val += mod;
                val = (val % mod);
                dp[i][j] = val;
            }
        }
        return (int)(dp[n][k]);
    }
    public static void main(String[] args) {
        int n = 3;
        int k = 1;
        System.out.println(new git_25().kInversePairs(n, k));`
    }
}