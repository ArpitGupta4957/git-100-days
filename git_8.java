import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class git_8 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafValues1 = getLeafValues(root1);
        List<Integer> leafValues2 = getLeafValues(root2);

        return leafValues1.equals(leafValues2);
    }

    private List<Integer> getLeafValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        if(root==null){
            stack.push(root);
        }
        

        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();

            if (currentNode.left == null && currentNode.right == null) {
                result.add(currentNode.val);
            } else {
                if(currentNode.right!=null) {
                    stack.push(currentNode.right);
                }
                if(currentNode.left != null) {
                    stack.push(currentNode.left);
                }
            }
        }
        return result;
    }
}