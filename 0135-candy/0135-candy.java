class Solution {
    public int candy(int[] r) {
        int []a = new int[r.length];
        int []b = new int[r.length];
        Arrays.fill(a,1);
        Arrays.fill(b,1);
        for(int i=0; i<r.length; i++){
            if(i!=0&&r[i]>r[i-1]){
                a[i]=a[i-1]+1;
            }
            if(i!=r.length-1&&r[r.length-1-i]<r[r.length-2-i]){
                b[r.length-2-i]=b[r.length-1-i]+1;
            }
        }
        int k=0;
        for(int i=0; i<r.length; i++){
            k+=Math.max(a[i],b[i]);
        }
        return k;
    }
}