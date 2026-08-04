class Solution {
    public String reverseWords(String s) {
        String[] w = s.trim().split("\\s+");
        s="";
        for (int i = w.length - 1; i >= 0; i--) {
            s=s+w[i];

            if (i != 0)
                s=s+" ";
        }
        return s;
    }
}