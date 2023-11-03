public class Reverse {
    public static void main(String[] args) {

        System.out.println(reverse(1824));

    }

    public static int reverse(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (reverse(n / 10) * 10 + n % 10);
    }

}
