class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        boolean[] used = new boolean[26];

        // Count frequency of every character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            freq[c - 'a']--;

            // Already present in stack
            if (used[c - 'a']) {
                continue;
            }

            // Remove bigger characters if they appear again later
            while (!st.isEmpty()
                    && st.peek() > c
                    && freq[st.peek() - 'a'] > 0) {

                used[st.pop() - 'a'] = false;
            }

            st.push(c);
            used[c - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        for (char c : st) {
            ans.append(c);
        }

        return ans.toString();
    }
}