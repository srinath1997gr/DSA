package GeeksForGeeks;

import java.util.Arrays;

public class KstacksOneArray {

    private static int n;
    private static int k;
    private static int free = 0;
    private static int[] arr;
    private static int[] top;
    private static int[] next;

    KstacksOneArray(int n, int k) {

        arr = new int[n];
        top = new int[k];
        next = new int[n];
        for (int i = 0; i < k; i++) {
            top[i] = -1;
        }

        for (int j = 0; j < n; j++) {
            if (j == n - 1) {
                next[j] = -1;
                break;
            }
            next[j] = (j + 1) % n;
        }
    }

    public static void push(int stack, int value) {
        if (!isFull()) {
            int i = free;
            arr[i] = value;
            free = next[i];
            next[i] = top[stack];
            top[stack] = i;
        }
    }

    public static int pop(int stack) {
        int i = top[stack];
        int removed = arr[i];

        top[stack] = next[i];

        next[i] = free;
        free = i;

        return removed;
    }

    public static void display() {
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(top));
        System.out.println(Arrays.toString(next));
    }

    public static boolean isFull() {
        return free == -1;
    }

    public static void main(String[] args) {

        KstacksOneArray k = new KstacksOneArray(8, 3);

        push(0, 1);
        push(1, 2);

        push(2, 3);
        push(1, 4);
        push(1, 5);
        push(1, 6);

        push(2, 7);
        push(2, 8);

        display();
        System.out.println(pop(2));
        display();
        System.out.println(pop(2));
        display();
        System.out.println(pop(2));
        display();

        push(2, 10);
        display();

    }
}
