class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls = new ArrayList<>();
        if (s.length() < p.length()) return ls;

        HashMap<Character, Integer> mp = new HashMap<>();
        HashMap<Character, Integer> np = new HashMap<>();
        for (char c : p.toCharArray()) mp.put(c, mp.getOrDefault(c, 0) + 1);
        for (int i = 0; i < p.length(); i++)
            np.put(s.charAt(i), np.getOrDefault(s.charAt(i), 0) + 1);

        if (chk(mp, np)) ls.add(0);

        for (int i = p.length(); i < s.length(); i++) {
            char out = s.charAt(i - p.length());
            char in = s.charAt(i);
            np.put(out, np.get(out) - 1);
            np.put(in, np.getOrDefault(in, 0) + 1);
            if (chk(mp, np)) ls.add(i - p.length() + 1);
        }
        return ls;
    }

    private boolean chk(HashMap<Character, Integer> mp, HashMap<Character, Integer> np) {
        for (char c : mp.keySet())
            if (!mp.get(c).equals(np.getOrDefault(c, 0))) return false;
        return true;
    }
}