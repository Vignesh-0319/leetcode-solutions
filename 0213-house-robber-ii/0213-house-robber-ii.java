class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        int[] p = new int[nums.length];
        Arrays.fill(p,-1);
        return Math.max(solve(nums, dp, nums.length-2),olve(nums,p, nums.length-1));
    }
    private int solve(int[] nums, int dp[], int idx){
        if(idx==0)return nums[idx];
        if(idx<0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int m1 = nums[idx] + solve(nums,dp,idx-2);
        int m2 = solve(nums,dp,idx-1);
        return dp[idx] = Math.max(m1,m2);
    }
    
    private int olve(int[] nums, int p[], int idx){
        if(idx==1)return nums[idx];
        if(idx<1) return 0;
        if(p[idx]!=-1) return p[idx];
        int m1 = nums[idx] + olve(nums,p,idx-2);
        int m2 = olve(nums,p,idx-1);
        return p[idx] = Math.max(m1,m2);
    }
}