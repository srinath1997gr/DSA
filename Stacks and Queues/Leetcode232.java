public class Leetcode232 {

    DyanmicStack stack1;
    DyanmicStack stack2;

    public Leetcode232() {

        stack1 = new DyanmicStack();
        stack2 = new DyanmicStack();

    }

    public void push(int x) throws StackException {

        stack1.push(x);

    }

    public int pop() throws StackException {

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int removed = stack2.pop();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return removed;

    }

    public int peek() throws StackException {

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int peeked = stack2.peak();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return peeked;

    }

    public boolean empty() {

        return stack1.isEmpty();

    }
}
