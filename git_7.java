class BinarySearchTree {
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        if (root.data >= low && root.data <= high) {
            sum += root.data;
        }
        if (root.data > low) {
            sum += rangeSumBST(root.left, low, high);
        }
        if (root.data < high) {
            sum += rangeSumBST(root.right, low, high);
        }
        return sum;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        BinarySearchTree.TreeNode root = new BinarySearchTree.TreeNode(10);
        root.left = new BinarySearchTree.TreeNode(5);
        root.right = new BinarySearchTree.TreeNode(15);
        root.left.left = new BinarySearchTree.TreeNode(3);
        root.left.right = new BinarySearchTree.TreeNode(7);
        root.right.right = new BinarySearchTree.TreeNode(18);

        System.out.println(bst.rangeSumBST(root, 7, 15));
    }
}