public class Patterns {

    public static void pattern1() {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern2() {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern3() {
        int n = 4;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < (n - row); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern4() {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    public static void pattern5() {
        int n = 4;
        for (int row = 1; row <= 2 * n; row++) {
            int totalcols = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalcols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6() {
        int n = 4;
        for (int row = 1; row <= 2 * n; row++) {
            int totalcols = row > n ? 2 * n - row : row;

            for (int space = 1; space <= n - totalcols; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalcols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern7() {
        int n = 4;
        for (int row = 1; row <= n; row++) {

            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1();
        System.out.println();
        pattern2();
        System.out.println();
        pattern3();
        System.out.println();
        pattern4();
        System.out.println();
        pattern5();
        System.out.println();
        pattern6();
        System.out.println();
        pattern7();
    }
}
