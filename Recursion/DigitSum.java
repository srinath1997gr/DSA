public class DigitSum {

    public static void main(String[] args) {
        // System.out.println(digitSum(124));
        // System.out.println(digitProd(55));
        // System.out.println(reverse(5785));
        System.out.println(palindrome(12));

    }

    public static int digitSum(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + digitSum(n / 10);
    }

    public static int digitProd(int n) {
        if (n % 10 == n) {
            return n;
        }

        return n % 10 * digitProd(n / 10);
    }

    public static int reverse(int n) {
        if (n == 0) {
            return 0;
        }
        int digit = (int) Math.log10(n) + 1;
        int rem = n % 10;

        return rem * (int) Math.pow(10, digit - 1) + reverse(n / 10);
    }

    public static boolean palindrome(int n) {
        return n == reverse(n);
    }

}
