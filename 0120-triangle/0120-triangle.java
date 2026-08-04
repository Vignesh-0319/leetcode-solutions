class Solution {

    public int minimumTotal(List<List<Integer>> t) {

        int n = t.size();

        Integer[][] dp = new Integer[n][n];

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, sol(t, i, n - 1, dp));
        }

        return ans;
    }

    private int sol(List<List<Integer>> t, int i, int row, Integer[][] dp) {

        if (i < 0 || i > row)
            return 1000000000;

        if (row == 0 && i == 0)
            return t.get(0).get(0);

        if (dp[row][i] != null)
            return dp[row][i];
            
        return dp[row][i] = t.get(row).get(i) + Math.min(sol(t, i, row - 1, dp), sol(t, i - 1, row - 1, dp));
    }
}