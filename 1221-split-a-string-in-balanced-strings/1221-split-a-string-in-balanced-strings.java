class Solution {
    public int balancedStringSplit(String s) {
        int r = 0;
        int c = 0;
        for(char cr : s.toCharArray()){
            if(cr=='R') r++;
            else r--;
            if(r==0) c++;
        }
        return c;
    }
}