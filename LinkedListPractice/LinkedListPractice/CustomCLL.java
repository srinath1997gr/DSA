package LinkedListPractice;

public class CustomCLL {

    public static void main(String[] args) {
        CLL cl = new CLL();
        cl.insert(7);
        cl.insert(5);
        cl.insert(10);
        cl.insert(8);

        cl.display();

        cl.delete(7);

        cl.display();
    }

}
