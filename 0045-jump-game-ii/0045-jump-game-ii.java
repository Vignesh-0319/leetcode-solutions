class Solution {
    public int jump(int[] nums) {
        int l = 0, h = 0, t = 0, cnt = 0;

        while (h < nums.length - 1) {
            while (l <= h) {
                t = Math.max(t, l + nums[l]);
                l++;
            }

            h = t;
            cnt++;
        }

        return cnt;
    }
}