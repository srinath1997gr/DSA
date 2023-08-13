import java.util.Arrays;

public class StartAndEndOfTarget {
    public static void main(String[] args) {

        int[] arr = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        System.out.println(Arrays.toString(startToEnd(arr, target)));
        System.out.println(
                Arrays.toString(new int[] { smallestIndexToTarget(arr, target), largestIndexToTarget(arr, target) }));

    }

    public static int largestIndexToTarget(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int count = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                count = mid;
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        if (count >= 0)
            return count;

        return -1;
    }

    public static int smallestIndexToTarget(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int count = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                count = mid;
                end = mid - 1;

            } else if (target < arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        if (count >= 0)
            return count;

        return -1;

    }

    public static int[] startToEnd(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                int left = mid;
                int right = mid;
                while ((right + 1) < arr.length && target == arr[right + 1]) {
                    right++;
                }
                while ((left - 1) > 0 && target == arr[left - 1]) {
                    left--;
                }
                return new int[] { left, right };

            } else if (target < arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return new int[] { -1, -1 };

    }
}

