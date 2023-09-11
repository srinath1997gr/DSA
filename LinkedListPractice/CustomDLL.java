public class CustomDLL {

    public static void main(String args[]) {

        DLL dl = new DLL();

        dl.insertFirst(9);
        dl.insertFirst(4);
        dl.insertFirst(10);
        dl.insertFirst(2);
        dl.insertFirst(7);

        dl.display();
        System.out.println();

        dl.insertLast(5);

        dl.display();
        System.out.println();

        dl.inserAfterNode(10, 5);

        dl.display();
        System.out.println();

    }

}
