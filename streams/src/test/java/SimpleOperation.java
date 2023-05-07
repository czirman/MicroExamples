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

    @Test
    // TODO wywala wyjatek zwiazany z jedna z waznych cech strumieni
    public void test1() {

        Stream<Klasa> stream = Arrays.asList(new Klasa(1), new Klasa(4), new Klasa(2), new Klasa(10), new Klasa(19)).stream();
        Stream<Object> b = stream.map(arg -> arg.getHup());//.collect(Collectors.toList());
        b.collect(Collectors.toList());

        Stream<String> stringStream = Stream.of("A", "B", "C", "D");
        Stream<String> result1 = stringStream.filter(arg -> arg.equals("A"));

        result1.collect(Collectors.toList());
        //result1.findFirst();

    }

    /* To ciekawy przypadek zamykania strumienia
       okazuje się że operacja przypisania do innego strumienia też (poza operacjami kończącymi) zamyka strumieni (linia )

     */
    public void should_throw_exception_when_exception_closed_in_creation_phase(){

    }
}
