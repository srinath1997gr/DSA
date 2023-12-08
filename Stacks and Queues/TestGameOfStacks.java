public class TestGameOfStacks {

    public static void main(String[] args) throws StackException {

        DyanmicStack stack1 = new DyanmicStack();
        stack1.push(5);
        stack1.push(4);
        stack1.push(3);
        stack1.push(2);
        stack1.push(1);

        DyanmicStack stack2 = new DyanmicStack();

        stack2.push(9);
        stack2.push(8);
        stack2.push(7);
        stack2.push(6);

        GameOfStacks g = new GameOfStacks();

        System.out.println(g.gameOfStacks(stack1, stack2, 10));

    }

}
