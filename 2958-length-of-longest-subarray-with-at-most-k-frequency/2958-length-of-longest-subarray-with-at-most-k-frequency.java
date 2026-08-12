class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int l = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i] ,mp.getOrDefault(nums[i] ,0)+1);
            while(mp.get(nums[i])>k){
                mp.put(nums[l],mp.getOrDefault(nums[l],0)-1);
                l++;
            }
            max = Math.max(max,i-l+1);
        }
        return max;
    }
}