class Solution {
    public int uniquePaths(int m, int n) {
        Integer dp[][] = new Integer[m][n];
        return chk(m-1,n-1,dp);
    }
    private int chk(int m, int n,Integer [][]dp){
        if(m==0&&n==0) return 1;
        if(0>m||0>n) return 0;
        if(dp[m][n]!=null) return dp[m][n];
        return dp[m][n] = chk(m-1,n,dp)+chk(m,n-1,dp);
    }
} 
