class Solution {
    public boolean validPalindrome(String s) {
        int l=0, r=s.length()-1;
        boolean chk = true;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return ch(s,l+1,r)||ch(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
    private boolean ch(String s, int l, int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}