class Solution {
    public String reverseWords(String s) {
        int a = s.length()-1;
        StringBuilder sb = new StringBuilder();
        while(a>=0){
            while(a>=0 && s.charAt(a)==' '){
                a--;
            }
            if(a<0)break;
            int b = a;
            while(a>=0 && s.charAt(a)!=' '){
                a--;
            }
            if(sb.length()>0)sb.append(" ");
            sb.append(s.substring(a+1,b+1));
        }
        return sb.toString();
    }
}