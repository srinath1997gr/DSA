public class CustomLL {

    public static void main(String[] args) {
        LL l = new LL();

        l.inserFirst(9);
        l.inserFirst(10);
        l.inserFirst(16);

        l.inserFirst(7);

        l.inserFirst(13);

        l.inserFirst(5);

        l.insertLast(23);

        l.insert(9, 4);

        l.display();

        l.insertRec(22, 2);

        l.display();

        System.out.println(l.deleteFirst());

        l.display();

        System.out.println(l.deleteLast());

        l.display();

        System.out.println(l.delete(3));

        l.display();

        System.out.println(l.find(9));

    }

}
