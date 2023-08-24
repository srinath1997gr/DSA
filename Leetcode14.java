import java.util.Arrays;

public class Leetcode14 {

    public static void main(String[] args) {

        String[] arr = { "ab", "a" };

        System.out.println(optimizedLongestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] strs) {

        String result = "";

        if (strs.length == 1) {
            return strs[0];
        }

        for (int i = 0; i < strs[0].length(); i++) {

            for (String str : strs) {

                if (!(i < str.length() && strs[0].charAt(i) == str.charAt(i))) {
                    return result;
                }
            }

            result = result + strs[0].charAt(i);

        }

        return result;
    }

    public static String optimizedLongestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }

        String prefix = strs[0];

        for (int i = 0; i < strs.length; i++) {

            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}
