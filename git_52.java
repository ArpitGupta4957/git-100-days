public class git_52 {
    static class ListNode{
        int  val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode detectCycle(ListNode head) {
        ListNode left = head;
        ListNode right = head;
     
        while (right != null && right.next != null) {
      
            left = left.next;
            right = right.next.next;
            if (left == right) break;
        }
    
        if (right == null || right.next == null) return null;
        left = head;
        while (left != right) {
            left = left.next;
            right = right.next;
        }
        return left;
    }
}
