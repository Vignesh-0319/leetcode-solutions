class Solution {
    public int[] distributeCandies(int c, int p) {
        int[] arr = new int[p];
        Arrays.fill(arr, 0);
        int i = 1, t=0;
        while(c>0){
            if(c-i>0){
            arr[(i-1)%p]+=i;
            }
            else{
            arr[(i-1)%p]+=c;
            }
            c-=i;
            i++;
        }
        return arr;
    }
}