class Solution {
    public String makeFancyString(String s) {
        if(s.length() < 3) return s;

        StringBuilder g = new StringBuilder();
        int i = 0;

        for(i = 0; i < s.length() - 2; i++) {
            if(s.charAt(i) == s.charAt(i+1) &&
               s.charAt(i) == s.charAt(i+2)) {
                continue;
            }

            g.append(s.charAt(i));
        }

        g.append(s.charAt(i));
        g.append(s.charAt(i+1));

        return g.toString();
    }
}