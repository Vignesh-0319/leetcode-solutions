class Solution {
    public int[] asteroidCollision(int[] as) {

        ArrayList<Integer> ls = new ArrayList<>();

        for (int a : as) {

            boolean destroyed = false;

            if (a < 0) {

                while (!ls.isEmpty() && ls.get(ls.size() - 1) > 0) {

                    int last = ls.get(ls.size() - 1);

                    if (last < Math.abs(a)) {
                        ls.remove(ls.size() - 1);
                    }
                    else if (last == Math.abs(a)) {
                        ls.remove(ls.size() - 1);
                        destroyed = true;
                        break;
                    }
                    else {
                        destroyed = true;
                        break;
                    }
                }
            }

            if (!destroyed) {
                ls.add(a);
            }
        }

        int[] ans = new int[ls.size()];

        for (int i = 0; i < ls.size(); i++) {
            ans[i] = ls.get(i);
        }

        return ans;
    }
}