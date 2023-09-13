

public class DLL {

    private Node head;

    public void insertFirst(int value) {

        Node n = new Node(value);
        n.next = head;
        n.prev = null;
        if (head != null)
            head.prev = n;
        head = n;

    }

    public void insertLast(int value) {

        if (head == null) {
            insertFirst(value);
            return;
        }

        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        Node n = new Node(value, null, last);
        last.next = n;
    }

    public void inserAfterNode(int p, int value) {

        Node temp = head;

        if (head == null) {
            insertFirst(value);
            return;
        }

        while (temp.value != p) {
            temp = temp.next;
        }

        Node n = new Node(value, temp.next, temp);
        if (temp.next != null) {
            temp.next.prev = n;
        }
        temp.next = n;

    }

    public void display() {
        Node temp = head;

        Node last = null;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("In reverse Order");

        while (last != null) {
            System.out.print(last.value + " <- ");
            last = last.prev;
        }

        System.out.println("start");

    }

    public class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;

        }
    }

}
