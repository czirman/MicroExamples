package stream;

import java.util.ArrayList;
import java.util.List;

public class NoModyfication {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        numbers.stream()
                .map(v -> numbers.add(6) ? 1 : 0)
                .forEach(System.out::println);
    }
}
