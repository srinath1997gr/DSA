import java.util.List;

public class ProblemLinkedList {

    public ListNode head;
    public ListNode tail;

    private int size;

    public ProblemLinkedList() {
        this.size = 0;
    }

    public void inserFirst(int value) {

        ListNode n = new ListNode(value);
        n.next = head;
        head = n;

        if (tail == null) {
            tail = head;
        }

        size += 1;

    }

    public void insertLast(int value) {
        if (tail == null) {
            inserFirst(value);
            return;
        }
        ListNode n = new ListNode(value);
        tail.next = n;
        tail = n;
        size++;

    }

    public void insert(int value, int index) {
        if (index == 0) {
            inserFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        ListNode temp = head;
        for (int i = 1; i < 3; i++) {
            temp = temp.next;
        }

        ListNode n = new ListNode(value, temp.next);
        temp.next = n;

        size++;
    }

    public void insertRec(int value, int index) {

        head = insertRec(value, index, head);

    }

    private ListNode insertRec(int value, int index, ListNode node) {

        if (index == 0) {
            ListNode n = new ListNode(value, node);
            size++;
            return n;
        }

        node.next = insertRec(value, index - 1, node.next);
        return node;
    }

    public ListNode find(int value) {
        ListNode start = head;

        while (start != null) {
            if (start.value == value) {
                return start;
            }

            start = start.next;
        }

        return null;
    }

    public void display() {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }

        System.out.println("END");
    }

    public boolean hasCycle() {
        ListNode f = head;
        ListNode s = head;

        if (head == null) {
            return false;
        }

        while (s != null && s.next != null) {
            f = f.next;
            s = s.next.next;
            if (f == s) {
                return true;
            }

        }
        return false;

    }

    public int lengthOfCycle() {
        ListNode f = head;
        ListNode s = head;

        if (head == null) {
            return 0;
        }

        while (s != null && s.next != null) {
            f = f.next;
            s = s.next.next;
            if (f == s) {
                ListNode temp = f;
                int length = 0;

                do {
                    temp = temp.next;
                    length++;
                } while (temp != f);

                return length;
            }

        }
        return 0;

    }

    public ListNode detectCycle(ListNode head) {

        ListNode f = head;
        ListNode s = head;

        if (hasCycle()) {

            int length = lengthOfCycle();

            if (length == 0) {
                return null;
            }

            while (length > 0) {
                f = f.next;
                length--;
            }

            while (f != s) {
                s = s.next;
                f = f.next;
            }

            return s;

        }

        return null;

    }

    public ListNode sortList(ListNode head) {

        ListNode left_head = head;
        ListNode right_head = head;

        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = middleNode(head);

        right_head = mid.next;
        mid.next = null;
        left_head = head;

        ListNode left = sortList(left_head);
        ListNode right = sortList(right_head);

        return mergeTwoLists(left, right);

    }

    public ListNode middleNode(ListNode head) {

        ListNode fast = head.next;
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

    public ListNode findListNode(int value) {
        ListNode start = head;

        while (start != null) {
            if (start.value == value) {
                return start;
            }

            start = start.next;
        }

        return null;
    }

    public void bubbleSort() {

        ListNode temp = head;

        int length = 0;
        while (temp != null) {
            temp = temp.next;
            length++;
        }

        bSort(length, 0);

    }

    public ListNode getNode(int c) {
        ListNode temp = head;

        while (c > 0 && temp != null) {
            temp = temp.next;
            c--;
        }
        return temp;

    }

    public void bSort(int r, int c) {

        if (r == 0) {
            return;
        }

        if (r > c) {
            ListNode firstNode = getNode(c);
            ListNode secondNode = getNode(c + 1);

            if (firstNode != null && secondNode != null && firstNode.value > secondNode.value) {

                swap(c, firstNode, secondNode);

            }
            bSort(r, c + 1);
        } else {

            bSort(r - 1, 0);

        }

    }

    private void swap(int c, ListNode f, ListNode s) {

        if (c == 0) {
            int t = s.value;
            s.value = f.value;
            f.value = t;
            f.next = s;

        } else {

            ListNode prev = getNode(c - 1);
            int t = s.value;
            s.value = f.value;
            f.value = t;
            f.next = s;
            prev.next = f;

        }

    }

    public void reverseLinkedList() {
        ListNode temp = head;

        reverseBetween(temp, 1, 2);
    }

    public ListNode reverse(ListNode temp) {
        if (temp.next == null) {
            tail = temp;
            return temp;
        }

        ListNode n = reverse(temp.next);

        ListNode t = n;

        temp.next = null;

        while (n.next != null)
            n = n.next;

        n.next = temp;

        return t;
    }

    public void reverse1(ListNode temp) {
        if (temp.next == null) {
            head = tail;
            return;
        }

        reverse1(temp.next);

        temp.next = null;
        tail.next = temp;
        tail = tail.next;
    }

    public ListNode reverse2(ListNode temp) {

        ListNode prev = null;
        ListNode pres = temp;
        ListNode next = temp.next;

        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if (next != null)
                next = next.next;
        }

        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

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

    public boolean isPalindrome(ListNode head) {

        ListNode temp = head;
        ListNode loopTemp = head;

        int length = 0;
        while (loopTemp != null) {
            loopTemp = loopTemp.next;
            length++;
        }

        ListNode prev = null;
        ListNode current = temp;

        for (int i = 0; current != null && i < length / 2; i++) {
            prev = current;
            current = current.next;
        }

        ListNode temp1 = prev;

        prev = null;
        ListNode next = current != null ? current.next : null;

        for (int j = length / 2 + 1; current != null && j < length + 1; j++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null)
                next = next.next;
        }

        for (int k = 0; k < length / 2; k++) {

            if (prev.value != head.value)
                return false;

            prev = prev.next;
            head = head.next;
        }

        return true;
    }

    public void reorderList(ListNode head) {
        ListNode loopTemp = head;

        int length = 0;
        while (loopTemp != null) {
            loopTemp = loopTemp.next;
            length++;
        }

        ListNode prev = null;
        ListNode current = head;

        for (int i = 0; current != null && i < length / 2; i++) {
            prev = current;
            current = current.next;
        }

        prev = null;
        ListNode next = current != null ? current.next : null;

        for (int j = length / 2 + 1; current != null && j < length + 1; j++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null)
                next = next.next;
        }

        ListNode temp = head;
        ListNode hs = prev;
        ListNode hf = temp;

        while (hs != null && hf != null) {
            ListNode t = hf.next;
            hf.next = hs;
            hf = t;

            t = hs.next;
            hs.next = hf;
            hs = t;
        }

        if (hf != null) {
            hf.next = null;
        }

    }
}
