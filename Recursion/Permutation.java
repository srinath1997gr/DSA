import java.util.ArrayList;

public class Permutation {

    public static void main(String args[]) {

        permutation("", "abc");
        System.err.println(permutationList("", "abc").toString());

    }

    public static void permutation(String p, String up) {

        if (up.length() == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 0; i <= p.length(); i++) {
            permutation(p.substring(0, i) + up.charAt(0) + p.substring(i), up.substring(1));
        }

    }

    public static ArrayList<String> permutationList(String p, String up) {

        if (up.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> l = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            l.addAll(permutationList(p.substring(0, i) + up.charAt(0) + p.substring(i), up.substring(1)));
        }

        return l;

    }
}
