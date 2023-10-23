import java.util.ArrayList;
import java.util.List;

public class Leetcode17 {

    public static void main(String args[]) {

        System.out.println(letterCombinations(""));

    }

    public static String returnCharacters(int n) {

        switch (n) {
            case 1:
                return "";
            case 2:
                return "abc";
            case 3:
                return "def";
            case 4:
                return "ghi";
            case 5:
                return "jkl";
            case 6:
                return "mno";
            case 7:
                return "pqrs";
            case 8:
                return "tuv";
            case 9:
                return "wxyz";
            default:
                return "";
        }
    }

    public static List<String> letterCombinations(String digits) {
        return helper("", digits);
    }

    private static List<String> helper(String p, String up) {

        if (up.length() == 0) {
            List<String> l = new ArrayList<String>();
            l.add(p);
            return l;
        }

        List<String> insideList = new ArrayList<String>();
        String s = returnCharacters(Integer.parseInt("" + up.charAt(0)));
        for (int i = 0; i < s.length(); i++) {
            insideList.addAll(helper(p + s.charAt(i), up.substring(1)));
        }

        return insideList;
    }

}
