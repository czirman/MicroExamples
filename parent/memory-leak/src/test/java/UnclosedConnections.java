import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class UnclosedConnections {

    @Test
    public void givenConnection_whenUnclosed_thenOutOfMemory()
            throws IOException, URISyntaxException {

        URL url = new URL("https://stackify.com/memory-leaks-java/");
        URLConnection urlc = url.openConnection();
        InputStream is = urlc.getInputStream();
        String str = "";
    }
}
// Nie wiem jak to działą
