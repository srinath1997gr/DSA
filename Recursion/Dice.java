import java.util.ArrayList;
import java.util.List;

public class Dice {

    public static void main(String[] args) {

        System.out.println(helper("", 4).toString());

    }

    public static List<String> helper(String p, int up) {

        if (up == 0) {
            List<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        List<String> insideList = new ArrayList<>();
        for (int i = 1; i <= up; i++) {
            insideList.addAll(helper(p + i, up - i));
        }

        return insideList;

    }
}
