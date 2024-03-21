public class git_78 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }

        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode nextNode;
        while(currNode!=null){
            nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;

        return head;
    }
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println("Original Linked List: ");
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        head = reverseList(head);
        System.out.println("\nReversed Linked List: ");
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
