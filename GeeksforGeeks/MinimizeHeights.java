package GeeksforGeeks;

import java.util.Arrays;

public class MinimizeHeights {

    public static void main(String[] args) {

        int[] arr = { 1, 8, 10, 6, 4, 6, 9, 1 };

        System.err.println(minimizeMaximizeHeights(arr, arr.length, 2));

    }

    public static int minimizeMaximizeHeights(int[] arr, int n, int k) {

        Arrays.sort(arr);

        int res = arr[n - 1] - k - arr[0] + k;

        int min = arr[0] + k;

        int max = arr[n - 1] - k;


        int curr_min, curr_max;

        for (int i = 1; i < n - 1; i++) {

            curr_min = Math.min(min, arr[i + 1] - k);
            curr_max = Math.max(max, arr[i] + k);

            if (curr_min >= 0) {
                res = Math.min(res, curr_max - curr_min);
            }

        }

        return res;

    }

}
