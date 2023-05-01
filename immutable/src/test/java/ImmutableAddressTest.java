import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ImmutableAddressTest {

    @Test
    public void tryToChange() {

        List<String> list = Collections.EMPTY_LIST;
        Collections.addAll(list = new ArrayList<String>(), "C", "C++", "Java");
        ImmutableAddress ob1 = new ImmutableAddress("Beata", "Warszawa", list);
        assertThrows(UnsupportedOperationException.class, () -> {
            ob1.getList().add("d");
        });
    }

}
