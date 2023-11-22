package GeeksForGeeks;

import java.util.Arrays;

public class NextGreaterElement {

    public static void nextgreaterelement(int[] arr) {
        Stack s = new Stack();
        int[] res = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            if (s.isEmpty()) {
                res[i] = -1;
                s.push(arr[i]);
            } else {
                if (arr[i] <= s.peak()) {
                    res[i] = s.peak();
                    s.push(arr[i]);
                } else {
                    while (!s.isEmpty() && arr[i] >= s.peak()) {
                        s.pop();
                    }
                    res[i] = s.peak();
                    s.push(arr[i]);
                }

            }
        }

        System.out.println(Arrays.toString(res));

    }

    public static void main(String args[]) {

        int[] arr = { 6, 8, 0, 1, 3 };

        nextgreaterelement(arr);
    }

}
