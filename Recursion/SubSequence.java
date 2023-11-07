import java.util.ArrayList;

public class SubSequence {

    public static void main(String[] args) {

        // subSequence("", "abc");

        // subSequencewithAsscii("", "abc");

        // ArrayList<String> a = new ArrayList<>();

        // a.addAll(subSequenceList("", "abc"));
        // System.out.println(a.toString());

        System.out.println(subSequenceListWithAsscii("", "abc").toString());
    }

    static void subSequence(String p, String s) {

        if (s.isEmpty()) {
            System.out.println(p);
            return;
        }

        subSequence(p + s.charAt(0), s.substring(1));
        subSequence(p, s.substring(1));
    }

    static ArrayList<String> subSequenceList(String p, String s) {

        ArrayList<String> al = new ArrayList<>();

        if (s.isEmpty()) {
            al.add(p);
            return al;
        }

        ArrayList<String> al1 = subSequenceList(p + s.charAt(0), s.substring(1));
        ArrayList<String> al2 = subSequenceList(p, s.substring(1));

        al.addAll(al1);
        al.addAll(al2);

        return al;
    }

    static void subSequencewithAsscii(String p, String s) {

        if (s.isEmpty()) {
            System.out.println(p);
            return;
        }

        subSequencewithAsscii(p + s.charAt(0), s.substring(1));
        subSequencewithAsscii(p, s.substring(1));
        subSequencewithAsscii(p + (s.charAt(0) + 0), s.substring(1));

    }

    static ArrayList<String> subSequenceListWithAsscii(String p, String s) {

        if (s.isEmpty()) {
            ArrayList<String> al = new ArrayList<>();

            al.add(p);
            return al;
        }

        ArrayList<String> al1 = subSequenceListWithAsscii(p + s.charAt(0), s.substring(1));
        ArrayList<String> al2 = subSequenceListWithAsscii(p, s.substring(1));
        ArrayList<String> al3 = subSequenceListWithAsscii(p + (s.charAt(0) + 0), s.substring(1));

        al1.addAll(al2);
        al1.addAll(al3);

        return al1;
    }
}
