import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;


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
}
