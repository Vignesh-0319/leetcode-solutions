class Solution {
    public String removeKdigits(String num, int k) {

        if (k >= num.length()) return "0";

        List<Character> ls = new ArrayList<>();

        for (char c : num.toCharArray()) {

            while (!ls.isEmpty()
                    && ls.get(ls.size() - 1) > c
                    && k > 0) {

                ls.remove(ls.size() - 1);
                k--;
            }

            ls.add(c);
        }

        while (k > 0) {
            ls.remove(ls.size() - 1);
            k--;
        }

        StringBuilder g = new StringBuilder();

        int i = 0;
        while (i < ls.size() && ls.get(i) == '0') {
            i++;
        }

        for (; i < ls.size(); i++) {
            g.append(ls.get(i));
        }

        return g.length() == 0 ? "0" : g.toString();
    }
}