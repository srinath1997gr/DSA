import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 10, 6, 7, 9, 8 };

        bubblesort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[] { 2, 10, 6, 7, 9, 8 };

        selectionSort(arr1, arr.length, 1, 0);
        System.out.println(Arrays.toString(arr1));

    }

    public static void bubblesort(int[] arr, int end, int start) {

        if (end == 0) {
            return;
        }
        if (end > start) {
            if (arr[start] > arr[start + 1]) {
                int temp = arr[start + 1];
                arr[start + 1] = arr[start];
                arr[start] = temp;
            }
            bubblesort(arr, end, start + 1);
        } else {
            bubblesort(arr, end - 1, 0);
        }

    }

    public static void selectionSort(int[] arr, int end, int start, int maxIndex) {

        if (end == 0) {
            return;
        }
        if (end > start) {
            if (arr[maxIndex] < arr[start]) {
                maxIndex = start;
            }
            selectionSort(arr, end, start + 1, maxIndex);
        } else {
            int temp = arr[start - 1];
            arr[start - 1] = arr[maxIndex];
            arr[maxIndex] = temp;
            selectionSort(arr, end - 1, 0, 0);
        }

    }

}
