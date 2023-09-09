package LinkedListPractice;

public class CLL {

    private Node head;
    private Node tail;

    public void insert(int value) {
        Node n = new Node(value);

        if (head == null) {
            n.next = n;
            head = n;
            tail = n;
            return;
        }
        tail.next = n;
        n.next = head;
        tail = n;
    }

    public void delete(int value) {
        Node temp = head;
        Node prev = head;
        if (head != null) {
            while (temp.value != value) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
        } else
            System.out.println("no iems in circular linked list");
        if (head.value == value) {
            tail.next = head.next;
            head = head.next;
        }

    }

    public void display() {
        Node temp = head;

        if (temp != null) {
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);

        }
        System.out.println("head");

        System.out.println("head - " + head.value);
        System.out.println("tail - " + tail.value);

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
