class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Integer dp[][] = new Integer[m][n];
        return sol(grid,m-1,n-1,dp);
    }
    private int sol(int[][]grid, int m, int n, Integer dp[][]){
        if(m<0||n<0) return Integer.MAX_VALUE;
        if(m==0&&n==0) return grid[0][0];
        if(dp[m][n]!=null) return dp[m][n];
        return dp[m][n]=grid[m][n]+Math.min(sol(grid,m-1,n,dp),sol(grid,m,n-1,dp));
    }
}