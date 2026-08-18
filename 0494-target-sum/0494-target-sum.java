class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int num : nums){
            sum+=num;
        }
        if(Math.abs(target)>sum) return 0;
        Integer [][]dp = new Integer[nums.length+1][2*sum+1];
        return sol(nums, nums.length, target, dp, 0, sum);
    }
    private int sol(int[] nums, int i, int target, Integer[][] dp, int val, int offset){
        if(i==0){
            if(val==target) return 1;
            else return 0;
        }
        if(dp[i][val + offset]!=null) return dp[i][val + offset];
        return dp[i][val+offset] = sol(nums, i-1,target, dp, val+nums[i-1],offset)+sol(nums, i-1,target, dp, val-nums[i-1],offset);
    }
}