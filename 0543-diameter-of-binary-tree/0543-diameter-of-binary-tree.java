class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int bt[] = new int[1];
        check(root, bt);
        return bt[0];
    }
    private int check(TreeNode root, int[] bt){
        if(root==null) return 0;
        int L = check(root.left, bt);
        int R = check(root.right, bt);
        bt[0] = Math.max(L+R, bt[0]);
        return 1 + Math.max(L,R);
    }
}