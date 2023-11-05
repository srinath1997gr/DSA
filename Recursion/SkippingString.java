public class SkippingString {

    public static void main(String[] args) {

        // System.out.println(skip('a', "bacccsad"));
        // skip2('a', "bacccsad", "");

        System.out.println(skipString("apple", "sjhfgjhagapplehjbjh"));
    }

    static String skip(Character a, String s) {
        if (s.length() == 0) {
            return "";
        }
        if (a == s.charAt(0)) {
            return "" + skip(a, s.substring(1));
        } else {
            return s.charAt(0) + skip(a, s.substring(1));
        }
    }

    static void skip2(Character a, String s, String r) {
        if (s.length() == 0) {
            System.out.println(r);
            return;
        }
        if (a == s.charAt(0)) {
            skip2(a, s.substring(1), r);
        } else {
            skip2(a, s.substring(1), r + s.charAt(0));
        }
    }

    static String skipString(String a, String s) {
        if (s.length() == 0) {
            return "";
        }
        // if (s.startsWith(a)) {
        if (startswithInBuilt(s, a)) {
            return "" + skipString(a, s.substring(a.length()));
        } else {
            return s.charAt(0) + skipString(a, s.substring(1));
        }
    }

    static boolean startswithInBuilt(String s1, String s2) {

        int i = 0;
        while (i < s2.length()) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
            i++;
        }

        return true;
    }
}
