package GeeksForGeeks;

public class ReverseStack {

    private static Stack s;

    public ReverseStack(Stack s) {
        this.s = s;
    }

    public static void insert_at_bottom(int x) {
        if (s.isEmpty()) {
            s.push(x);
        } else {
            int a = s.pop();
            insert_at_bottom(x);
            s.push(a);
        }
    }

    public static void reverse() {
        if (!s.isEmpty()) {

            int a = s.pop();
            reverse();
            insert_at_bottom(a);

        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        ReverseStack r = new ReverseStack(s);

        r.reverse();

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }

}
