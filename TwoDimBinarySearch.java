import java.util.Arrays;

public class TwoDimBinarySearch {

    public static void main(String[] args) {

        int[][] a = {
                { 10, 22, 34, 40, 50 },
                { 13, 23, 36, 41, 54 },
                { 17, 24, 38, 44, 55 },
                { 19, 25, 39, 47, 57 }
        };
        int target = 25;

        System.out.println(Arrays.toString(binarySearch(a, target)));

    }

    public static int[] binarySearch(int[][] matrix, int target) {

        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[] { r, c };
            } else if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }

        return new int[] { -1, -1 };
    }

}
