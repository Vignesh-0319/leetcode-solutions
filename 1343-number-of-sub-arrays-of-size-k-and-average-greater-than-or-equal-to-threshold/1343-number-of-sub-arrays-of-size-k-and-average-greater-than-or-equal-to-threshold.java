class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int av = 0;
        for(int i=0; i<k; i++){
            av+=arr[i];
        }
        int cnt=0;
        if(av/k>=threshold) cnt++;
        for(int i=k; i<arr.length; i++){
            av=av-arr[i-k]+arr[i];
            if(av/k>=threshold) cnt++;
        }
        return cnt;
    }
}