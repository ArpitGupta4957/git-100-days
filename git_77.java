public class git_77 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = null;
        ListNode end = list1;

        // Set start to node a - 1 and end to node b
        for (int index = 0; index < b; index++) {
            if (index == a - 1) {
                start = end;
            }
            end = end.next;
        }
        // Connect the start node to list2
        start.next = list2;

        // Find the tail of list2
        while (list2.next != null) {
            list2 = list2.next;
        }
        // Set the tail of list2 to end.next
        list2.next = end.next;
        end.next = null;
        
        return list1;
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(1);
        ListNode list3 = new ListNode(2);
        ListNode list4 = new ListNode(3);
        ListNode list5 = new ListNode(4);
        ListNode list6 = new ListNode(5);
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list5;
        list5.next = list6;
        ListNode result = mergeInBetween(list1, 3, 4, list2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
