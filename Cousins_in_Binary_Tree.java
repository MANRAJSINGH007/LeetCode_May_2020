class Solution {
    static TreeNode r1;
    static TreeNode r2;
    static int l1 = 0;
    static int l2 = 0;
    public static void func(TreeNode root, int x, int y, int l, TreeNode parent) {
        if(root == null) return;
        if(root.val == x) {
            r1 = parent;
            l1 = l;
        } else if(root.val == y) {
            r2 = parent;
            l2 = l;
        }
        if(r1 == null || r2 == null) func(root.left, x, y, l + 1, root);
        if(r1 == null || r2 == null) func(root.right, x, y, l + 1, root);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        if(x == y || root == null) return false;
        l1 = l2 = 0;
        r1 = r2 = null;
        func(root, x, y, 0, null);
        return (l1 == l2 && r1 != r2);
    }
}
