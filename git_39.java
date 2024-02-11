public class git_39 {
    public class ListNode {
        int val;
        ListNode next;
    
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
    
        ListNode dummy = new ListNode(0);
        dummy.next = head;
    
        ListNode first = dummy;
        ListNode second = dummy;
    
        // Move first pointer n nodes ahead
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
    
        // Move both pointers until first reaches the end
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
    
        // Remove the n-th node from the end
        if (second.next != null) {
            second.next = second.next.next;
        } else {
            // If first pointer is at the end of the list, it means we need to remove the head
            dummy.next = dummy.next.next;
        }
    
        return dummy.next;
    }
}
