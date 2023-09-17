
public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void inserFirst(int value) {

        Node n = new Node(value);
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
        Node n = new Node(value);
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

        Node temp = head;
        for (int i = 1; i < 3; i++) {
            temp = temp.next;
        }

        Node n = new Node(value, temp.next);
        temp.next = n;

        size++;
    }

    public void insertRec(int value, int index) {

        head = insertRec(value, index, head);

    }

    private Node insertRec(int value, int index, Node node) {

        if (index == 0) {
            Node n = new Node(value, node);
            size++;
            return n;
        }

        node.next = insertRec(value, index - 1, node.next);
        return node;
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        size--;
        return value;
    }

    public Node getNode(int index) {
        Node temp = head;

        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }

        return temp;

    }

    public int deleteLast() {

        if (size <= 1) {
            return deleteFirst();
        }

        Node n = getNode(size - 2);
        int value = tail.value;
        tail = n;
        tail.next = null;

        return value;

    }

    public int delete(int index) {
        if (index <= 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = getNode(index - 1);

        int value = prev.next.value;

        prev.next = prev.next.next;

        return value;
    }

    public Node find(int value) {
        Node start = head;

        while (start != null) {
            if (start.value == value) {
                return start;
            }

            start = start.next;
        }

        return null;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }

        System.out.println("END");
    }

    public class Node {
        private int value;
        private Node next;

        public Node() {

        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public boolean hasCycle() {
        Node f = head;
        Node s = head;

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

}
