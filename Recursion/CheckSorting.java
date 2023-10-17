public class CheckSorting {

    public static void main(String[] args) {

        System.out.println(checkSorting(new int[] { 2, 1, 3, 4, 5, 6 }));

    }

    public static boolean checkSorting(int[] num) {

        return helper(num, 0);

    }

    public static boolean helper(int[] n, int i) {
        if (i == n.length - 1)
            return true;
        return n[i] < n[i + 1] && helper(n, i + 1);
    }

}
