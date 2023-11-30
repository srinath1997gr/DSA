public class CustomStack {
    protected int[] data;

    protected static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) throws StackException {
        if (isFull()) {
            throw new StackException("The Stack is full, the item cannot be inserted.");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (ptr == -1) {
            throw new StackException("Cannot pop from an empty stack.");
        }
        int value = data[ptr];
        ptr--;
        return value;
    }

    public int peak() throws StackException {
        if (isEmpty()) {
            throw new StackException("cannot find the peak of the stack as it is empty.");
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