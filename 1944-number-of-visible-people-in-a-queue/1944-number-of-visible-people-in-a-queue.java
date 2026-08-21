class Solution {
    public int[] canSeePersonsCount(int[] h) {
        int[] arr = new int[h.length];
        Stack<Integer> st = new Stack<>();
        for(int i=h.length-1; i>=0; i--){
            while(!st.isEmpty() && h[i]>st.peek()){
                st.pop();
                arr[i]++;
            }
            if(!st.isEmpty()){
                arr[i]++;
            }
            st.push(h[i]);
        }
        return arr;
    }
}