import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sorting {

    public static int[] sort012(int a[], int n) {
        // code here
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < (a.length - 1 - i); j++)
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
        }
        return a;
    }

    public static int[] sort013(int a[], int n) {
        // code here
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (a[j] > a[j - 1]) {
                    break;
                } else {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        return a;
    }

    public static int sort014(int a[], int n) {
        // code here
        int i = 0;
        while (i < a.length) {
            int correct = a[i] - 1;
            if (a[i] != a[correct]) {
                swap(a, i, a[i] - 1);
            } else {
                i++;
            }
        }

        for (int j = 0; j < a.length; j++) {
            if ((j + 1) != a[j] && a[j] <= (j + 1)) {
                return a[j];
            }
        }
        return a.length;
    }

    public static List<Integer> sort015(int nums[], int n) {
        // code here
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        List<Integer> a = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if ((j + 1) == nums[j] && nums[j] <= (j + 1)) {
                a.add(nums[j]);
            }
        }
        return a;
    }

    public static int sort016(int nums[]) {
        // code here
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;

    }

    public static void swap(int[] a, int first, int second) {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }

    public static void main(String[] args) {

        int[] indices = { -1, 2, 2, 3 };
        int b = sort016(indices);
        System.out.println(b);
    }
}