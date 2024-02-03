class git_32{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static boolean isValidBST(Node root){
        if(root==null){
            return true;
        }
        return isValid(root, null, null);
    }
    public static boolean isValid(Node root, Integer min, Integer max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min){
            return false;
        }
        if(max!=null && root.data>=max){
            return false;
        }
        return isValid(root.left, min, root.data) && isValid(root.right, root.data, max);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.right = new Node(18);
        System.out.println(isValidBST(root));
    }
}