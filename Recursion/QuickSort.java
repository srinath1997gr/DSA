import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void quickSort(int[] arr, int low, int high) {

        int s = low;
        int e = high;

        if (low >= high) {
            return;
        }

        int mid = s + (e - s) / 2;
        int p = arr[mid];

        while (s <= e) {

            while (arr[s] <= p) {
                s++;
            }

            while (arr[e] >= p) {
                p++;
            }

            if (s <= e) {
                int temp = arr[e];
                arr[e] = arr[s];
                arr[s] = temp;
                e--;
                s++;
            }
        }

        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }

}
