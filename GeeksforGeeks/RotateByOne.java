package GeeksforGeeks;

import java.util.Arrays;

public class RotateByOne {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(rotate(arr)));

    }

    public static int[] rotate(int[] arr) {
        // code here
        int temp = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            arr[arr.length - 1 - (i - 1)] = arr[arr.length - 2 - (i - 1)];
        }

        arr[0] = temp;

        return arr;

    }
}
