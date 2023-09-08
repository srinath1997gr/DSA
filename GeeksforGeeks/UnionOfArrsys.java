package GeeksforGeeks;

import java.util.HashMap;

public class UnionOfArrsys {

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 3 };
        System.out.println(doUnion(arr1, arr2));
    }

    public static int doUnion(int arr1[], int arr2[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int a : arr1) {
            map.put(a, a);
        }

        for (int b : arr2) {
            map.put(b, b);
        }

        return map.size();
    }

}
