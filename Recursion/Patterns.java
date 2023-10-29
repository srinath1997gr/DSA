public class Patterns {

    public static void main(String[] args) {

        // inverseTriangle(4, 0);
        // triangle(4, 0);
        triangle2(4, 4);

    }

    static void inverseTriangle(int r, int c) {
        if (r == 0)
            return;

        if (c < r) {
            System.out.print("* ");
            inverseTriangle(r, c + 1);
        } else {
            System.out.println("");
            inverseTriangle(r - 1, 0);
        }
    }

    static void triangle(int r, int c) {
        if (r == 0)
            return;

        if (c < r) {
            triangle(r, c + 1);
            System.out.print("* ");
        } else {
            triangle(r - 1, 0);
            System.out.println("");
        }
    }

    static void triangle2(int r, int c) {
        if (r == 0)
            return;

        if (c >= r) {
            System.out.print("* ");
            triangle2(r, c - 1);
        } else {
            System.out.println("");
            triangle2(r - 1, 4);
        }
    }

}
