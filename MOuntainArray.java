public class MOuntainArray {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 5, 1 };
        int target = 1;

        int peak = peakIndex(arr);
        int ascIndex = ascendingBS(arr, target, 0, peak);
        int dscINdex = descendingBS(arr, target, peak, arr.length - 1);

        int res = ascIndex >= 0 && dscINdex >= 0 ? ascIndex < dscINdex ? ascIndex : dscINdex
                : ascIndex > dscINdex ? ascIndex : dscINdex;
        System.out.println(res);

    }

    public static int peakIndex(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
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

    public static int descendingBS(int[] arr, int target, int si, int en) {

        int start = si;
        int end = en;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;

            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }
}
