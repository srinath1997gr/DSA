public class Main {

    public static String longestPalindrome(String s) {
        String res = "" + s.charAt(0);
        for (int i = 0; i < s.length() - 1; i++) {
            int low;
            int high;
            if (s.charAt(i) == s.charAt(i + 1)) {
                if (s.substring(i, i + 2).length() > res.length()) {
                    res = s.substring(i, i + 2);
                }
                low = i - 1;
                high = i + 2;
                while (low >= 0 && high <= s.length() - 1) {
                    if (s.charAt(low) == s.charAt(high)) {
                        if (s.substring(low, high + 1).length() > res.length()) {
                            res = s.substring(low, high + 1);
                        }
                        low--;
                        high++;
                    } else {
                        break;
                    }
                }
            } else {
                low = i - 1;
                high = i + 1;
                while (low >= 0 && high <= s.length() - 1) {
                    if (s.charAt(low) == s.charAt(high)) {
                        if (s.substring(low, high + 1).length() > res.length()) {
                            res = s.substring(low, high + 1);
                        }
                        low--;
                        high++;
                    } else {
                        break;
                    }
                }

            }
        }

        return res;
    }

    public static void main(String args[]) {

        String ans = longestPalindrome("ccc");
        System.out.println(ans);
    }

}
