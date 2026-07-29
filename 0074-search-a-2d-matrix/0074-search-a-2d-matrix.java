class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        int l=0,r=m.length*m[0].length-1;
        while(l<=r){
            int mi = l+(r-l)/2;
            
            if(m[mi/m[0].length][mi%m[0].length]==target) return true;
            else if(m[mi/m[0].length][mi%m[0].length]>target){
                r=mi-1;
            }
            else{
                l=mi+1;
            }
        }
        return false;
    }
}