class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        // Target is outside possible range
        if (Math.abs(target) > sum) {
            return 0;
        }

        int offset = sum;

        Integer[][] dp = new Integer[nums.length + 1][2 * sum + 1];

        return sol(nums, nums.length, target, dp, 0, offset);
    }

    private int sol(int[] nums, int i, int target,
                    Integer[][] dp, int val, int offset) {

        // Base case
        if (i == 0) {
            return val == target ? 1 : 0;
        }

        // Already calculated
        if (dp[i][val + offset] != null) {
            return dp[i][val + offset];
        }

        int num = nums[i - 1];

        // Choose +
        int add = sol(
            nums,
            i - 1,
            target,
            dp,
            val + num,
            offset
        );

        // Choose -
        int subtract = sol(
            nums,
            i - 1,
            target,
            dp,
            val - num,
            offset
        );

        // Store answer
        dp[i][val + offset] = add + subtract;

        return dp[i][val + offset];
    }
}