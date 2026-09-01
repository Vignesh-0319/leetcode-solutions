class Solution {
    public String minRemoveToMakeValid(String s) {
      int i = 0;
      StringBuilder sb = new StringBuilder();
      Stack<Character> st = new Stack<>();
      for(char c : s.toCharArray()){
        if(c=='(')i++;
        if(c==')')i--;
        if(i<0) {
            i++;
            continue;
        }
        sb.append(c);
      }
     int k = sb.length() - 1;

        while (i > 0) {

            if (sb.charAt(k) == '(') {
                sb.deleteCharAt(k);
                i--;
            }

            k--;
        }
      return sb.toString(); 
    }
}