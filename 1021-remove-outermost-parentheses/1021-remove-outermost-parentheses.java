class Solution {
    public String removeOuterParentheses(String s) {
        String st = "";
        int cnt = 0;
        int j=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(') cnt++;
            else cnt--;
            if(cnt==0){
                st+=s.substring(j+1,i);
                j=i+1;
            }
        }
        return st;
    }
}