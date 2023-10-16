import java.util.ArrayList;
import java.util.Arrays;

public class CheckElement {
    public static void main(String[] args) {

        System.out.println(checkElement(new int[] { 2, 45, 60, 74, 3, 0 }, 60, 0));
        System.out.println(checkElementIndex(new int[] { 2, 45, 60, 74, 3, 0 }, 60, 0));
        System.out.println(checkElementIndexFromLast(new int[] { 2, 45, 60, 74, 3, 0 }, 45,
                new int[] { 2, 45, 60, 74, 3, 0 }.length - 1));

        findAll(new int[] { 2, 45, 60, 60, 3, 0 }, 60, 0);
        System.out.println(list);

        ArrayList result = findAllWithList(new int[] { 2, 45, 60, 60, 3, 0 }, 60, 0,
                new ArrayList<>());

        System.out.println(result);

        ArrayList result2 = findAllWithList2(new int[] { 2, 45, 60, 60, 3, 0 }, 60, 0);
        System.out.println(result2);

    }

    public static boolean checkElement(int[] num, int target, int i) {
        if (i >= num.length) {
            return false;
        }
        return num[i] == target || checkElement(num, target, i + 1);
    }

    public static int checkElementIndex(int[] num, int target, int i) {
        if (i >= num.length) {
            return -1;
        }
        return num[i] == target ? i : checkElementIndex(num, target, i + 1);
    }

    public static int checkElementIndexFromLast(int[] num, int target, int i) {
        if (i < 0) {
            return -1;
        }
        return num[i] == target ? i : checkElementIndexFromLast(num, target, i - 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    public static void findAll(int[] num, int target, int i) {
        if (i >= num.length) {
            return;
        }
        if (num[i] == target)
            list.add(i);

        findAll(num, target, i + 1);
    }

    public static ArrayList<Integer> findAllWithList(int[] num, int target, int i, ArrayList<Integer> list) {
        if (i >= num.length) {
            return list;
        }
        if (num[i] == target)
            list.add(i);

        return findAllWithList(num, target, i + 1, list);
    }

    public static ArrayList<Integer> findAllWithList2(int[] num, int target, int i) {

        ArrayList<Integer> list = new ArrayList<>();
        if (i >= num.length) {
            return list;
        }
        if (num[i] == target)
            list.add(i);

        list.addAll(findAllWithList2(num, target, i + 1));

        return list;
    }
}
