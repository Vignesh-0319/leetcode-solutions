class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == goal.charAt(0)) {

                boolean ok = true;

                for (int k = 0; k < s.length(); k++) {
                    if (s.charAt((k + i) % s.length()) != goal.charAt(k)) {
                        ok = false;
                        break;
                    }
                }

                if (ok) return true;
            }
        }

        return false;
    }
}