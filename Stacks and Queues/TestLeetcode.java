public class TestLeetcode {
    public static void main(String[] args) throws StackException {
        Leetcode232 l = new Leetcode232();

        l.push(1);
        l.push(2);
        System.out.println(l.peek());
        System.out.println(l.pop());
        System.out.println(l.empty());

    }
}
