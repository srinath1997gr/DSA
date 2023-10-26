import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(mergeSort(arr)));

        mergeSortInplace(arr, 0, arr.length);

        System.out.println(Arrays.toString(arr));

    }

    static void mergeSortInplace(int[] arr, int s, int e) {

        if ((e - s) == 1) {
            return;
        }

        int mid = (e + s) / 2;

        mergeSortInplace(arr, s, mid);
        mergeSortInplace(arr, mid, e);

        mergeInplace(arr, s, e, mid);
    }

    private static void mergeInplace(int[] arr, int s, int e, int mid) {

        int[] res = new int[e - s];

        int k = 0;
        int x = s;
        int y = mid;

        while (x < mid && y < e) {
            if (arr[s] < arr[mid]) {
                res[k] = arr[x];
                x++;
            } else {
                res[k] = arr[y];
                y++;
            }
            k++;
        }

        while (x < mid) {
            res[k] = arr[x];
            x++;
            k++;
        }

        while (y < e) {
            res[k] = arr[y];
            y++;
            k++;
        }

        for (int i = 0; i < res.length; i++) {
            arr[s + i] = res[i];
        }

    }

    static int[] mergeSort(int[] arr) {

        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {

        int[] res = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                res[k] = first[i];
                i++;
            } else {
                res[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            res[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            res[k] = second[j];
            j++;
            k++;
        }

        return res;

    }

}
