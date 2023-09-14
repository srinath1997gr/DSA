public class Leetcode25 extends ProblemLinkedList {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;

        int length = 0;
        while (temp != null) {
            temp = temp.next;
            length++;
        }

        return reverseKGroup(head, 1, k, k, length);

    }

    private ListNode reverseKGroup(ListNode head, int i, int j, int k, int length) {
        if (j > length) {
            return head;
        }

        head = reverseBtw(head, i, j);
        return reverseKGroup(head, i + k, j + k, k, length);
    }

    public ListNode reverseBtw(ListNode head, int left, int right) {

        ListNode prev = null;
        ListNode current = head;

        for (int i = 0; i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode temp1 = prev;
        ListNode temp2 = current;

        ListNode next = current.next;

        for (int j = 0; j < right - left + 1; j++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null)
                next = next.next;
        }

        if (temp1 != null) {
            temp1.next = prev;
        } else {
            head = prev;
        }

        temp2.next = current;

        return head;
    }

}
