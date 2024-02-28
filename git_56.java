class git_56{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    int maxDepth;
    int result;
    public int findBottomLeftValue(TreeNode root) {
        maxDepth = -1;
        dfs(root, 0);
        
        return result;
    }

    private void dfs(TreeNode root, int currDpth){
        if(root==null){
            return ;
        }

        if(currDpth>maxDepth){
            maxDepth = currDpth;
            result = root.val;
        }

        dfs(root.left, currDpth+1);
        dfs(root.right, currDpth+1);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);
        System.out.println(new git_56().findBottomLeftValue(root));
    }
}