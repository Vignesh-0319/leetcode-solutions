class Solution {
    public int divide(int n, int d) {
        if (n == Integer.MIN_VALUE && d == -1)
            return Integer.MAX_VALUE;
        boolean sign = (n >= 0) == (d >= 0);
        long n1 = Math.abs((long) n);
        long d1 = Math.abs((long) d);

        int ans = 0;

        while (n1 >= d1) {
            int cnt = 0;

            while (n1 >= (d1 << (cnt + 1))) {
                cnt++;
            }

            ans += (1 << cnt);
            n1 -= (d1 << cnt);
        }

        return sign ? ans : -ans;
    }
}