class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums, dp, nums.length-1);
    }
    private int solve(int[] nums, int dp[], int idx){
        if(idx==0)return nums[idx];
        if(idx<0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int m1 = nums[idx] + solve(nums,dp,idx-2);
        int m2 = solve(nums,dp,idx-1);
        return dp[idx] = Math.max(m1,m2);
    }
}