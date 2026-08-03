class Solution {
    public String stoneGameIII(int[] s) {
        Integer[] dp = new Integer[s.length];
        int ans = chk(s, 0, dp);

        if (ans > 0) return "Alice";
        if (ans < 0) return "Bob";
        return "Tie";
    }

    private int chk(int[] s, int i, Integer[] dp) {
        if (i >= s.length)
            return 0;

        if (dp[i] != null)
            return dp[i];

        int t1 = s[i] - chk(s, i + 1, dp);

        int t2 = Integer.MIN_VALUE;
        if (i + 1 < s.length)
            t2 = s[i] + s[i + 1] - chk(s, i + 2, dp);

        int t3 = Integer.MIN_VALUE;
        if (i + 2 < s.length)
            t3 = s[i] + s[i + 1] + s[i + 2] - chk(s, i + 3, dp);

        return dp[i] = Math.max(t1, Math.max(t2, t3));
    }
}