class Solution {
    public int[] countBits(int n) {
        int dp[] = new int[n + 1];
        if(n == 0) return dp;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            int x = (int)(Math.log(i) / Math.log(2));
            if((int)Math.pow(2, x) == i) {
                dp[i] = 1;
                continue;
            }
            dp[i] = 1 + dp[i - (int)Math.pow(2, x)];
        }
        return dp;
    }
}
