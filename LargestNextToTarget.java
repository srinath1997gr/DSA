public class LargestNextToTarget {
    public static void main(String[] args) {

        char[] arr = { 'c', 'f', 'j' };

        System.out.println(arr[largestLetterNextToTarget(arr, 'c')]);
    }

    public static int largestLetterNextToTarget(char[] arr, char target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }

            if (start > end) {
                return start;
            }
        }
        return 0;

    }

}
