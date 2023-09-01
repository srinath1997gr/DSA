package GeeksforGeeks;

import java.util.Arrays;

public class Kadane {

    public static void main(String[] args) {

        int[] arr = { -1, -2, -3, -4 };

        // brutForce(arr);

        // optimizedSolution(arr);

        // if you want return the subarray which is responsible

        optimizedSolutionSubarray(arr);
    }

    private static void brutForce(int[] arr) {

        int finalSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                if (sum + arr[j] > finalSum) {
                    finalSum = sum + arr[j];
                }
                sum = sum + arr[j];
            }
        }

        System.out.println(finalSum);

    }

    private static void optimizedSolution(int[] arr) {

        int max_sum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max_sum) {
                max_sum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }

        }

        System.out.println(max_sum);

    }

    private static void optimizedSolutionSubarray(int[] arr) {

        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int ansStart = 0;
        int ansEnd = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0)
                start = i;
            if (sum > max_sum) {
                max_sum = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }

        }

        System.out.println(max_sum);

        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, ansStart, ansEnd + 1)));

    }

}
