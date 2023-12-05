import java.util.Arrays;

public class Leetcode84 {

    public static int[] leftSubArray(int[] arr) throws StackException {
        int[] res = new int[arr.length];

        DyanmicStack ds = new DyanmicStack();

        for (int i = 0; i < res.length; i++) {
            while (!ds.isEmpty() && arr[ds.peak()] >= arr[i]) {
                ds.pop();
            }
            res[i] = ds.isEmpty() ? 0 : ds.peak() + 1;
            ds.push(i);
        }

        return res;
    }

    public static int[] rightSubArray(int[] arr) throws StackException {
        int[] res = new int[arr.length];

        DyanmicStack ds = new DyanmicStack();

        for (int i = res.length - 1; i >= 0; i--) {

            while (!ds.isEmpty() && (arr[i] <= arr[ds.peak()])) {
                ds.pop();
            }
            res[i] = ds.isEmpty() ? res.length - 1 : ds.peak() - 1;
            ds.push(i);
        }

        return res;

    }

    public static int largestRectangleArea(int[] heights) throws StackException {

        int[] left_ans = leftSubArray(heights);
        int[] right_ans = rightSubArray(heights);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            if ((heights[i] * (right_ans[i] - left_ans[i] + 1)) > max) {
                max = heights[i] * (right_ans[i] - left_ans[i] + 1);
            }

        }
        return max;
    }

    public static void main(String[] args) throws StackException {
        int[] arr = { 2, 1, 5, 6, 2, 3, 1 };

        // int[] left_ans = leftSubArray(arr);
        // int[] right_ans = rightSubArray(arr);

        // System.out.println(Arrays.toString(left_ans));
        // System.out.println(Arrays.toString(right_ans));

        System.out.println(largestRectangleArea(arr));
    }

}
