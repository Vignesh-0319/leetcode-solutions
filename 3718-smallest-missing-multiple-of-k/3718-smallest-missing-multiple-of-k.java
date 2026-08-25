class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int n = k;

        while (set.contains(n)) {
            n += k;
        }

        return n;
    }
}