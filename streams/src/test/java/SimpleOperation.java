import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleOperation {

    @Test
    public void sortPrimitive(){
        List sorted = Stream.of(3,4,6,8,9,1)
                .sorted().collect(Collectors.toList());
    }

    // TODO interfejs Function obadać a ten test usunac
    @Test
    public void test() {
        Function ff = f -> f.toString();
    }

    @Test
    // TODO wywala wyjatek zwiazany z jedna z waznych cech strumieni
    public void test1() {

        Stream<Klasa> stream = Arrays.asList(new Klasa(1), new Klasa(4), new Klasa(2), new Klasa(10), new Klasa(19)).stream();
        Optional<Integer> b = stream.map(arg -> arg.getHup())
                .filter(arg -> arg == 2)
                .peek(arg -> arg = arg + 1)
                .findFirst();

        stream.collect(Collectors.toList());

    }
}
