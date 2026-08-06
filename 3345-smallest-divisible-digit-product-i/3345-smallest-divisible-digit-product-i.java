class Solution {
    public int smallestNumber(int n, int t) {
        int k = n;
        int digit = 1;

        while(k>0){
            digit=digit*(k%10);
            k=k/10;
            if(k==0){
                if(digit%t==0) return n;
                else{
                    n++;
                    k=n;
                    digit = 1;
                }
            }
        }
        return n;
    }
}