class Solution {
    public int[][] merge(int[][] in) {
        List<int[]> ls = new ArrayList<>();
        if(in.length==0)return ls.toArray(new int[0][]);
        Arrays.sort(in, (a,b)-> a[0] - b[0]);
        int s = in[0][0];
        int e = in[0][0];
        for(int []i : in){
            if(i[0]<=e){
                e = Math.max(e, i[1]);
            }
            else{
                ls.add(new int[] {s,e});
                s=i[0];
                e=i[1];
            }
        }
        ls.add(new int[] {s,e});
        return ls.toArray(new int[0][]);
    }
}