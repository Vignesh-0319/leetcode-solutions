class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            max = Math.max(max, map.get(c));
        }

        StringBuilder ans = new StringBuilder();

        for (int freq = max; freq >= 1; freq--) {

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {

                if (entry.getValue() == freq) {

                    for (int i = 0; i < freq; i++) {
                        ans.append(entry.getKey());
                    }

                }
            }
        }

        return ans.toString();
    }
}