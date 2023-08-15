import java.util.Arrays;

class sample {

    public static void main(String[] args) {

        int[] indices = { 7, 10, 4, 3, 20, 15 };

        mergesort(indices, 0, indices.length);
        System.out.println(Arrays.toString(indices));

    }

    public static void mergesort(int[] arr, int s, int e) {

        if (e - s == 1) {
            return;
        }

        int mid = (e + s) / 2;

        mergesort(arr, s, mid);
        mergesort(arr, mid, e);

        merge(arr, s, e, mid);

    }

    private static void merge(int[] arr, int s, int e, int mid) {

        int[] res = new int[e - s];

        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e) {

            if (arr[i] < arr[j]) {
                res[k] = arr[i];
                i++;
            } else {
                res[k] = arr[j];
                j++;
            }

            k++;
        }

        while (i < mid) {
            res[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            res[k] = arr[j];
            j++;
            k++;
        }

        for (int x = 0; x < res.length; x++) {
            arr[s + x] = res[x];
        }

    }

}