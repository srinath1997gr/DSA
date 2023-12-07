public class Test {

    public static void main(String[] args) throws StackException {
        // CustomStack stack = new CustomStack(5);

        DyanmicStack stack = new DyanmicStack(5);

        stack.push(35);
        stack.push(20);
        stack.push(67);
        stack.push(45);
        stack.push(85);
        stack.push(98);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peak());
        System.out.println(stack.pop());

    }

}
