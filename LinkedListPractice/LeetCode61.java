public class LeetCode61 extends ProblemLinkedList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        k = k % length;

        head = rotateList(head, k);
        return head;
    }

    public ListNode rotateList(ListNode head, int k) {

        if (k <= 0) {
            return head;
        }

        ListNode temp = head;

        int length = 1;
        while (temp.next != null) {
            if (temp != null)
                temp = temp.next;
            length++;
        }

        if (temp != null)
            temp.next = head;
        ListNode temp1 = temp;
        while (length > 1) {
            temp = temp.next;
            length--;
        }
        temp.next = null;
        return rotateList(temp1, k - 1);
    }
}
