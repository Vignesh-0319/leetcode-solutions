class Solution {
    public boolean checkInclusion(String p, String s) {
        if (s.length() < p.length()) return false;
        int[] a = new int[26], b = new int[26];
        for (int i = 0; i < p.length(); i++) {
            a[p.charAt(i) - 'a']++;
            b[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(a, b)) return true;
        for (int i = p.length(); i < s.length(); i++) {
            b[s.charAt(i) - 'a']++;
            b[s.charAt(i - p.length()) - 'a']--;
            if (Arrays.equals(a, b)) return true;
        }
        return false;
    }
}