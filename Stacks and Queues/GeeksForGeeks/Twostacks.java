package GeeksForGeeks;

public class Twostacks {

    public final static int DEAFULT_SIZE = 100;
    private static int[] a = new int[DEAFULT_SIZE];;
    private static int[] b = new int[DEAFULT_SIZE];;
    private static int ptr1 = -1;
    private static int ptr2 = -1;
    private static int size1 = 0;
    private static int size2 = 0;

    Twostacks() {
        a = new int[DEAFULT_SIZE];
        b = new int[DEAFULT_SIZE];
    }

    // Function to push an integer into the stack1.
    static void push1(int x) {
        if (isFull(a, size1)) {
            return;
        } else {
            a[++ptr1] = x;
            size1++;
        }

    }

    // Function to push an integer into the stack2.
    static void push2(int x) {
        if (isFull(b, size2)) {
            return;
        } else {
            b[++ptr2] = x;
            size2++;
        }
    }

    // Function to remove an element from top of the stack1.
    static int pop1() {
        if (isEmpty(a, size1)) {
            return -1;
        }
        int removed = a[ptr1--];
        size1--;
        return removed;
    }

    // Function to remove an element from top of the stack2.
    static int pop2() {
        if (isEmpty(b, size2)) {
            return -1;
        }
        int removed = b[ptr2--];
        size2--;
        return removed;
    }

    private static boolean isFull(int[] arr, int size) {
        return size == arr.length - 1;
    }

    private static boolean isEmpty(int[] arr, int size) {
        return size == 0;
    }

    public static void main(String[] args) {
        push1(2);
        push1(3);
        push2(4);
        System.out.println(pop1());
        System.out.println(pop2());
        System.out.println(pop2());
    }

}
