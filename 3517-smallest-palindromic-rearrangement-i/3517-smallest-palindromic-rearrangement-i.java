class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()<2) return s;
        int[] freq = new int[26];

        for (int i = 0; i < s.length() / 2; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        StringBuilder left = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            while (freq[i]-- > 0) {
                left.append((char) ('a' + i));
            }
        }

        StringBuilder ans = new StringBuilder();
        ans.append(left);

        if ((s.length() & 1) == 1) {
            ans.append(s.charAt(s.length() / 2));
        }

        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }
}