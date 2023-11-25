package GeeksForGeeks;

public class Stack<T> {

    protected int[] data;

    protected static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() {
        if (ptr == -1) {
            return -1;
        }
        int value = data[ptr];
        ptr--;
        return value;
    }

    public int peak() {
        if (isEmpty()) {
            return -1;
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
