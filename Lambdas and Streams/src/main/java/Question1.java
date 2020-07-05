import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Question1 {

    public static void main(String[] args) {

        IntStream inputValue = IntStream.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        OptionalDouble calAvg = inputValue.average();

        if (calAvg.isPresent()) {
            System.out.println(calAvg.getAsDouble());
        } else {
            System.out.println(-1);
        }
    }
}
