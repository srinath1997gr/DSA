public class Test {

    public static void main(String[] args) {

        LeetCode61 ll = new LeetCode61();

        ll.insertLast(1);

        ll.insertLast(2);

        ll.insertLast(3);
        ll.insertLast(4);

        ll.insertLast(5);

        ll.display();

        ll.head = ll.rotateRight(ll.head, 7);

        ll.display();
    }

}
