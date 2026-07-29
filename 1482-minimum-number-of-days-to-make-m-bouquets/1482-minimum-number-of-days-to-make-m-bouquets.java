class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)m*k) return -1;
        int l=1000,r=0;
        for(int i=0; i<bloomDay.length; i++){
            l=Math.min(l,bloomDay[i]);
            r=Math.max(r,bloomDay[i]);
        }
        while(l<r){
            int mid = l + (r-l)/2;
            if(check(bloomDay, mid, m, k)){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        
        return l;
    }
    
    private boolean check(int[] bloomDay,int mid, int m, int k){
            int cnt = 0;
            for(int j = 0; j<bloomDay.length; j++){
                if(bloomDay[j]<=mid){
                    cnt++;
                }
                else{
                    cnt=0;
                }
                if(cnt==k){
                    m--;
                    cnt=0;
                }
            }
            return(m<=0);
        }
}