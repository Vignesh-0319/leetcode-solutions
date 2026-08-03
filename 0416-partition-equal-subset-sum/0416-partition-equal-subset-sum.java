class Solution {

    public boolean canPartition(int[] nums) {

        int sum = 0;
        for (int x : nums)
            sum += x;

        if (sum % 2 != 0)
            return false;

        Boolean[][] dp = new Boolean[nums.length][sum / 2 + 1];

        return solve(nums, 0, sum / 2, dp);
    }

    private boolean solve(int[] nums, int i, int target, Boolean[][] dp) {

        if (target == 0)
            return true;

        if (i == nums.length || target < 0)
            return false;

        if (dp[i][target] != null)
            return dp[i][target];

        boolean take = solve(nums, i + 1, target - nums[i], dp);
        boolean skip = solve(nums, i + 1, target, dp);

        return dp[i][target] = take || skip;
    }
}