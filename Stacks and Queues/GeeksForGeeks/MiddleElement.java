package GeeksForGeeks;

public class MiddleElement {

    DoublyLinkedList d;

    MiddleElement() {
        d = new DoublyLinkedList();
    }

    public void push(int value) {
        d.insertLast(value);
    }

    public int pop() {
        return d.removeLast();
    }

    public int findMiddle() {
        return d.findMiddle();
    }

    public void deleteMiddle() {
        d.deleteMiddle();
    }

    public static void main(String[] args) {
        MiddleElement ms = new MiddleElement();
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
}
