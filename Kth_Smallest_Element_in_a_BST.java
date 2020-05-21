class Solution {
    static int count;
    public static TreeNode func(TreeNode root) {
        if(root == null) return null;
        TreeNode x = func(root.left);
        if(x != null) return x;
        count--;
        return count == 0 ? root : func(root.right);
        
    }
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        return func(root).val;
    }
}
