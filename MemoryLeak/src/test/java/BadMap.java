import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public class BadMap {

    @Test
    public void givenMap_whenNoEqualsNoHashCodeMethods_thenOutOfMemory()
            throws IOException, URISyntaxException {
        Map<Object, Object> map = System.getProperties();
        while (true) {
            map.put(new Key("key"), "value");
        }
    }
}


class Key {
    public String key;

    public Key(String key) {
        this.key = key;
    }
}