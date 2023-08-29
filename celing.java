public class celing {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 6 };
        System.out.println(celingofNumber(arr, 2));

    }

    public static int celingofNumber(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;

            } else if (target < arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }

            if (start > end) {
                return start;
            }
        }
        return -1;

    }

}
