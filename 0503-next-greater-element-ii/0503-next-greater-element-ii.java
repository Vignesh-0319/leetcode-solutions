class Solution {
    public int[] nextGreaterElements(int[] nums) {
      int []k = new int[nums.length];
      for(int i=0; i<nums.length; i++){
        k[i]=-1;
      for(int j=i; j<nums.length*2; j++){
        if(nums[j%nums.length]>nums[i]){
            k[i]=nums[j%nums.length];
            break;
        }
      }
      }
      return k;
    }
}