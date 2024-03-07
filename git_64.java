public class git_64 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        int num = 1;

        while(slow.next!=null){
            num++;
            slow = slow.next;
        }
        slow = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(num%2==0){
            return slow.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        git_64 test = new git_64();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println("The node at the middle is: " + test.middleNode(head).val);
        
    }
}
