package GeeksForGeeks;

public class DoublyLinkedList {

    private ListNode head;

    public void insertFirst(int val) {
        ListNode n = new ListNode(val);
        n.next = head;
        n.prev = null;
        head = n;
    }

    public void insertLast(int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }
        ListNode temp = head;
        ListNode n = new ListNode(val);
        n.next = null;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
        n.prev = temp;
    }

    public int removeLast() {
        ListNode temp = head;
        if (temp == null)
            return -1;
        while (temp.next != null) {
            temp = temp.next;
        }
        int removed = temp.val;
        temp.prev.next = null;
        return removed;
    }

    public int findMiddle() {
        ListNode temp1 = head;
        ListNode temp2 = head;

        if (temp1 == null || temp1.next == null)
            return -1;

        while (temp1 != null && temp2 != null && temp2.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }

        return temp1.val;
    }

    public ListNode findMiddleNode() {
        ListNode temp1 = head;
        ListNode temp2 = head;

        if (temp1 == null || temp1.next == null)
            return new ListNode(-1);

        while (temp1 != null && temp2 != null && temp2.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }

        return temp1;
    }

    public void deleteMiddle() {
        ListNode mid = findMiddleNode();

        ListNode temp = head;

        while (temp.val != mid.val) {
            temp = temp.next;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

    }

    public void insertAfterNode(int nodeValue, int value) {
        ListNode temp = head;
        if (head == null) {
            insertFirst(value);
            return;
        }

        while (temp.val != nodeValue) {
            temp = temp.next;
        }

        ListNode n = new ListNode(value);

        if (temp.next == null) {
            insertLast(value);
        } else {
            n.next = temp.next;
            n.prev = temp;
            temp.next = n;
        }
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("end");

    }

    class ListNode {
        private int val;
        private ListNode next;
        private ListNode prev;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next, ListNode prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;

        }

    }

    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();

        d.insertFirst(3);
        d.insertFirst(2);
        d.insertFirst(1);
        d.insertLast(4);
        d.insertLast(5);
        d.insertAfterNode(5, 8);

        d.display();
    }

}
