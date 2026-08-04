class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        Integer dp[][] = new Integer[m][n];
        return sol(obstacleGrid,m-1,n-1,dp);
    }
    private int sol(int[][] ob, int m, int n, Integer[][] dp){
        if(m<0||n<0) return 0;
        if(ob[m][n]==1)return 0;
        if(m==0&&n==0) return 1;
        if(dp[m][n]!=null) return dp[m][n];
        return dp[m][n]=sol(ob,m-1,n,dp)+sol(ob,m,n-1,dp);
    }
}