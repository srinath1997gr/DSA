public class Rotated_search {

    public static void main(String[] args) {

        int arr[] = { 5, 1, 3 };
        int target = 5;

        int peak = peakIndex(arr);

        int res;
        if (peak == -1) {
            res = ascendingBS(arr, target, 0, arr.length - 1);
        } else {
            if (arr[0] > target) {
                res = ascendingBS(arr, target, peak + 1, arr.length - 1);

            } else {
                res = ascendingBS(arr, target, 0, peak);

            }
        }

        System.out.println(res);

    }

    public static int peakIndex(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            } else if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static int ascendingBS(int[] arr, int target, int si, int en) {

        int start = si;
        int end = en;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;

            } else if (target < arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }

        }
        return -1;

    }

}
