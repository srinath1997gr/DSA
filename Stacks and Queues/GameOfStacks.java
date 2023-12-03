public class GameOfStacks {

    public int gameOfStacks(DyanmicStack stack1, DyanmicStack stack2, int max_sum) throws StackException {
        int count = 0;
        int sum = 0;

        return findCount(sum, stack1, stack2, count, max_sum);
    }

    private int findCount(int sum, DyanmicStack stack1, DyanmicStack stack2, int count, int max_sum)
            throws StackException {

        if (sum > max_sum) {
            return count - 1;
        }

        if (stack1.isEmpty() || stack2.isEmpty()) {
            return count;
        }

        int leftCount = 0;
        int rightCount = 0;
        int val1;
        int val2;
        if (!stack1.isEmpty()) {
            val1 = stack1.pop();
            int sum1 = sum + val1;

            leftCount = findCount(sum1, stack1, stack2, count + 1, max_sum);
            stack1.push(val1);
        }

        if (!stack2.isEmpty()) {
            val2 = stack2.pop();
            int sum2 = sum + val2;
            rightCount = findCount(sum2, stack1, stack2, count + 1, max_sum);
            stack2.push(val2);
        }

        return leftCount >= rightCount ? leftCount : rightCount;
    }

}
