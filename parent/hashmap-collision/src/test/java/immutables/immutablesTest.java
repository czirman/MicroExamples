package immutables;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class immutablesTest {

    @Test
    public void when_we_change_key() {
        User user1 = new User("Pablo");
        User user2 = new User("Ugot");
        Key key1 = new Key(1);
        Key key2 = new Key(2);
        Map<Key, User> users = new HashMap<>();
        users.put(key1, user1);
        users.put(key2, user2);

        System.out.println("Przed zmiana - klucz: " + key1 + ", user: " + users.get(key1));
        key1.setId(3);
        System.out.println("Po zmianie - klucz: " + key1 + ", user: " + users.get(key1));
    }

}
