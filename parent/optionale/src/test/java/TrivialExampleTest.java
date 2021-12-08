import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TrivialExampleTest {

    private final TrivialExample trivialExample = new TrivialExample();

    @Test
    public void useInBadWayWithNoEmptyString(){
        Optional<String> input = Optional.of(" DanaDana ");
        String result = trivialExample.getTrimBad(input);
        assertEquals("DanaDana", result  );
    }

    @Test
    public void useInBadWayWithNullValue(){
        Optional<String> input = Optional.ofNullable(null);
        String result = trivialExample.getTrimBad(input);
        assertEquals("", result  );
    }

    @Test
    public void useInGoodWayWithNoEmptyString(){
        String input = " DanaDana ";
        String result = trivialExample.getTrimGood(input);
        assertEquals("DanaDana", result  );
    }

    @Test
    public void useInGoodWayWithNullValue(){
        String input = null;
        String result = trivialExample.getTrimGood(input);
        assertEquals("", result  );
    }

    @Test
    public void test(){

        List lista= Arrays.asList("a","b","c","d","e" );
        Stream stream = lista.stream();
        stream.map(arg -> arg +"f").collect(Collectors.toList());

        Function ff = f -> f.toString();

    }

    @Test
    public void test1(){

        Stream<Klasa> stream = Arrays.asList( new Klasa(1),new Klasa(4),new Klasa(2),new Klasa(10),new Klasa(19)).stream();
        Optional<Integer> b = stream.map(arg -> arg.getHup())
                .filter(arg -> arg == 2)
                .peek(arg -> arg =arg+1)
                .findFirst();


        List list = stream.collect(Collectors.toList());

        Klasa ss = new Klasa(1) ;

    }

    @Test
    public void createStream_whenFindAnyResultIsPresent_thenCorrect() {
        List<String> list = Arrays.asList("A","B","C","D");

        Optional<String> result = list.stream().findAny();

        assertTrue(result.isPresent());
      // assertThat(result.get(), anyOf(is("A"), is("B"), is("C"), is("D")));
    }

}

class Klasa{

    int hup;

    public Klasa(int hup) {
        this.hup = hup;
    }

    public int getHup() {
        return hup;
    }

    public void setHup(int hup) {
        this.hup = hup;
    }

}
