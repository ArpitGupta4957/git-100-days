public class git_54 {
    static class TreeNode{
        int val;
        TreeNode left; 
        TreeNode right;
        TreeNode(int x) { val = x; }

    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case: both nodes are null
        if (p == null && q == null) {
            return true;
        }
        // One of the nodes is null, or their values are not equal
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        // Recursively check the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);
        TreeNode q = root.left;
        System.out.println(isSameTree(root, q));
    }
}
