public class git_79 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode mid = findMid(head);

        ListNode prev = null;
        ListNode curr = mid;
        while(curr!=null) {
            ListNode nxtNd = curr.next;
            curr.next = prev;

            prev = curr;
            curr= nxtNd;
        }

        ListNode right = prev; //head node after mid 
        ListNode left = head;

        while(right!=null) {
            if(right.val!=left.val) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
    public static ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null) //check condition for even and odd ll
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {

        ListNode head = new ListNode(1);   
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head));
        
    }
}
