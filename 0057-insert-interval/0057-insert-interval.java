class Solution {
    public int[][] insert(int[][] in, int[] nl) {
        ArrayList<int[]> res = new ArrayList<>();

        int i = 0;

        while (i < in.length && in[i][1] < nl[0]) {
            res.add(in[i]);
            i++;
        }

        while (i < in.length && in[i][0] <= nl[1]) {
            nl[0] = Math.min(nl[0], in[i][0]);
            nl[1] = Math.max(nl[1], in[i][1]);
            i++;
        }

        res.add(nl);

        while (i < in.length) {
            res.add(in[i]);
            i++;
        }

        return res.toArray(new int[res.size()][]);
    }
}