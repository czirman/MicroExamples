import org.junit.jupiter.api.Test;

import java.util.Arrays;
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
    public void useInBadWayWithNoEmptyString() {
        Optional<String> input = Optional.of(" DanaDana ");
        String result = trivialExample.getTrimBad(input);
        assertEquals("DanaDana", result);
    }

    @Test
    public void useInBadWayWithNullValue() {
        Optional<String> input = Optional.ofNullable(null);
        String result = trivialExample.getTrimBad(input);
        assertEquals("", result);
    }

    @Test
    public void useInGoodWayWithNoEmptyString() {
        String input = " DanaDana ";
        String result = trivialExample.getTrimGood(input);
        assertEquals("DanaDana", result);
    }

    @Test
    public void useInGoodWayWithNullValue() {
        String input = null;
        String result = trivialExample.getTrimGood(input);
        assertEquals("", result);
    }

    @Test
    public void createStream_whenFindAnyResultIsPresent_thenCorrect() {
        List<String> list = Arrays.asList("A", "B", "C", "D");
        Optional<String> result = list.stream().findAny();
        assertTrue(result.isPresent());
    }

}

