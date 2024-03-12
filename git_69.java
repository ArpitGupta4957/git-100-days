import java.util.HashMap;

public class git_69 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode removeZeroSumSublists(ListNode head) {
        int prefixSum = 0;
        HashMap<Integer, ListNode> hm = new HashMap<>();

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        hm.put(0, dummy);

        while(head!=null){
            prefixSum += head.val;

            if(hm.containsKey(prefixSum)){
                ListNode p = hm.get(prefixSum);
                ListNode start = p;
                int pSum = prefixSum;

                while(start!=head){
                    start = start.next;
                    pSum += start.val;

                    if(start!=head){
                        hm.remove(pSum);
                    }
                }
                p.next = start.next;
            }
            else {
                hm.put(prefixSum, head);
            }
            head = head.next;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        git_69 test = new git_69();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(-3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(1);
        System.out.println("Expected: 1, 2, -3, 3, 1. Actual: " + test.removeZeroSumSublists(head).val);
    }
}