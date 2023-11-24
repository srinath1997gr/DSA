package GeeksForGeeks;

public class SortStack {

    private static Stack s;

    public SortStack(Stack s) {
        this.s = s;
    }

    public static void insert_small_below(int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }
        if (x <= s.peak()) {
            s.push(x);
        } else {
            int a = s.pop();
            insert_small_below(x);
            s.push(a);
        }
    }

    public static void sort() {
        if (s.isEmpty()) {
            return;
        }

        int x = s.pop();

        sort();

        insert_small_below(x);

    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(11);
        s.push(2);
        s.push(32);
        s.push(3);
        s.push(41);

        SortStack a = new SortStack(s);

        a.sort();

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }

}
