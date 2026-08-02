class Solution {
    public boolean stoneGame(int[] p) {
        Integer [][]dp = new Integer[p.length][p.length]; 
        return chk(p,0,p.length-1,dp)>=0;
    }
    private int chk(int[] p, int l, int r, Integer[][] dp){
        if(l==r) return p[l];
        if(dp[l][r]!=null) return dp[l][r];
        int L = p[l]-chk(p, l+1, r, dp);
        int R = p[r]-chk(p,l,r-1,dp);
        return dp[l][r] = Math.max(L,R); 
    }
}