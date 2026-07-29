class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int r = Integer.MIN_VALUE;
        for(int k : nums){
            r=Math.max(r,k);
        }
        int l = 1;

        while(l<r){
            int m = l+(r-l)/2;
            int sum = 0;
            for(int k : nums){
                sum += (k + m - 1) / m;;
            }
            if(sum<=threshold) {
                r=m;
            }
            else l=m+1;
        }
    return l;
    }
}