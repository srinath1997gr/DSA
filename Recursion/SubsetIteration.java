import java.util.ArrayList;
import java.util.List;

public class SubsetIteration {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };

        List<List<Integer>> answers = subset(arr);

        for (List<Integer> i : answers) {
            System.out.println(i);
        }

    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int ele : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(ele);
                outer.add(internal);
            }
        }
        return outer;
    }

}