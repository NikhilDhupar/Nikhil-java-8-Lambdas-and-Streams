import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("xyz");
        list.add("fghfk");
        list.add("xwv");
        list = search(list);

        for (String a : list)
            System.out.println(a);
    }

    static List<String> search(List<String> list) {

        return list.stream().filter(s -> s.startsWith("x")).filter(s -> s.length() == 3).collect(Collectors.toList());

    }
}