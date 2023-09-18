public class MergeSorLL {

    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = middleNode(head);

        while (temp != mid) {
            temp = temp.next;
        }
        mid.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(temp);

        return mergeTwoLists(left, right);

    }

    public ListNode middleNode(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        ListNode head1 = list1;
        ListNode head2 = list2;

        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return head.next;
    }

}
