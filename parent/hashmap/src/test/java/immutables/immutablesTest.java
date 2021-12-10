package immutables;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class immutablesTest {

    @Test
    public void when_we_change_key() {
        User user1 = new User("Pablo");
        User user2 = new User("Ugot");
        Integer key1 = 1;
        Integer key2 = 2;
        Map<Integer, User> users = new HashMap<>();
        users.put(key1, user1);
        users.put(key2, user2);

        System.out.println("Przed zmiana - klucz: " + key1 + ", user: " + users.get(key1));
        key1 = 3;
        System.out.println("Po zmianie - klucz: " + key1 + ", user: " + users.get(key1));
    }

}
