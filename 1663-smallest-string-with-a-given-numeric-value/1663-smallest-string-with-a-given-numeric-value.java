class Solution {
    public String getSmallestString(int n, int k) {
        char[] ans = new char[n];
        Arrays.fill(ans, 'a');

        int extra = k - n;

        for (int i = n - 1; i >= 0 && extra > 0; i--) {
            int add = Math.min(25, extra);
            ans[i] += add;
            extra -= add;
        }

        return new String(ans);
    }
}