public class git_80 {
    static class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }
    public static void reorderList(ListNode head) {
        if(head==null || head.next==null)return ;

        ListNode slow = head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newNode = reverseList(slow.next);

        slow.next=null;
        ListNode curr = head;

        ListNode dummy = newNode;
        while(head!=null && dummy!=null){
            
           ListNode temp = curr.next;
           curr.next=dummy;
           ListNode temp2=dummy.next;
           dummy.next=temp;
           
           curr=temp;
           dummy=temp2;
        }
    }

    public static ListNode reverseList(ListNode node){
        ListNode prev = null;
        ListNode curr = node;
        ListNode next = null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String[] args) {
        // write your code here
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        reorderList(head);
        System.out.println("Reordered list: ");
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}