public class TestQueue {

    public static void main(String[] args) throws Exception {
        // CustomQueue queue = new CustomQueue(5);

        // queue.insert(20);
        // queue.insert(60);

        // queue.insert(90);

        // queue.insert(20);

        // queue.insert(50);

        // queue.display();

        // queue.remove();
        // queue.remove();

        // queue.display();

        CircularQueue queue = new CircularQueue(5);

        queue.insert(20);
        queue.insert(60);

        queue.insert(90);

        queue.insert(20);

        queue.insert(50);

        queue.display();

        queue.remove();
        queue.remove();

        queue.insert(10);
        queue.insert(100);
        queue.insert(101);

        queue.display();


        DynamicQueue dq = new DynamicQueue(5);

        dq.insert(20);
        dq.insert(60);

        dq.insert(90);

        dq.insert(20);

        dq.insert(50);

        dq.display();

        dq.remove();
        dq.remove();

        dq.insert(10);
        dq.insert(100);
        dq.insert(101);

        dq.display();

    }

}
