package GeeksForGeeks;

public class MiddleElementOptimized {

    private ListNode head = null;
    private ListNode mid = null;
    private ListNode tail = null;
    private int size = 0;

    public void push(int value) {
        ListNode n = new ListNode(value);
        n.next = null;
        if (size == 0) {
            n.prev = null;
            head = n;
            mid = n;
        } else {
            n.prev = tail;
            tail.next = n;
            if (size % 2 == 1) {
                mid = mid.next;
            }
        }
        tail = n;
        size++;
    }

    public int pop() {
        if (size == 0) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int removed = tail.val;

        if (size == 1) {
            head = tail = mid = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            if (size % 2 == 1) {
                mid = mid.prev;
            }
        }
        size--;
        return removed;
    }

    public int findMiddle() {
        if (mid == null) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return mid.val;
    }

    public void deleteMiddle() {
        if (mid == null) {
            System.out.println("No middle to delete.");
            return;
        }

        if (size == 1) {
            head = tail = mid = null;
        } else {
            if (mid.prev != null) {
                mid.prev.next = mid.next;
            }
            if (mid.next != null) {
                mid.next.prev = mid.prev;
            }

            if (size % 2 == 0) {
                mid = mid.prev;
            } else {
                mid = mid.next;
            }
        }
        size--;
    }

    public static void main(String[] args) {
        MiddleElementOptimized ms = new MiddleElementOptimized();
        ms.push(11);
        ms.push(22);
        ms.push(33);
        ms.push(44);
        ms.push(55);
        ms.push(66);
        ms.push(77);
        ms.push(88);
        ms.push(99);

        System.out.println("Popped : " + ms.pop());
        System.out.println("Popped : " + ms.pop());
        System.out.println("Middle Element : "
                + ms.findMiddle());

        ms.deleteMiddle();

        System.out.println("New Middle Element : "
                + ms.findMiddle());

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

}
