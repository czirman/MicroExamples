import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleOperation {

    @Test
    public void sortPrimitive(){
        List sorted = Stream.of(3,4,6,8,9,1)
                .sorted().collect(Collectors.toList());
    }
}
