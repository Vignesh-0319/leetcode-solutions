class Solution {
    public boolean uniformArray(int[] nums1) {
        for(int i = 0; i<nums1.length; i++){
            if(Math.abs(nums1[i]%2)==1) return true;
        }
        if(nums1[nums1.length-1]%2==0) return true;
        return false;
    }
}