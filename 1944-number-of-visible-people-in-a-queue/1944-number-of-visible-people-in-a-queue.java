class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> stack = new Stack();
        int n = heights.length;
        int[] ans = new int[n];
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            count = 0;
            while(stack.size() > 0 && heights[i] > stack.peek()) {
                stack.pop();
                count++;
            }
            if (stack.size() != 0) {
                count++;
            }
            ans[i] = count;
            stack.push(heights[i]);
        }   
        return ans;
    }
}