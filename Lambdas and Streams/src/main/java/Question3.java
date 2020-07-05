import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Question3 {

    public static void main(String args[]) {

        List<String> list = new ArrayList<>();

        list.add("abcba");
        list.add("add");
        list.add("xyzabc");
        list = palin(list);

        for (String a : list)
            System.out.println(a);
    }

    static List<String> palin(List<String> list) {

        List<String> l = new ArrayList<>();
        for (String a : list) {
            String t = a.replaceAll("\\s+", "").toLowerCase();
            if (IntStream.range(0, t.length() / 2).noneMatch(x -> t.charAt(x) != t.charAt(t.length() - x - 1)))
                l.add(a);
        }
        return l;
    }
}
