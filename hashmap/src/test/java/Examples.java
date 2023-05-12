import org.junit.jupiter.api.Test;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Examples {

    @Test
    public void when_we_change_key() {
        Person person = new Person(1);
        Map<Integer, Person> mapa = new HashMap<>();
        mapa.put(person.pesel, person);
        person.pesel = 2;
        Person personAgain = new Person(1);
        assertNull(mapa.get(personAgain));
    }
    @Test
    public void bad_equals_hashcode_implementation() {
        Set<ProductBad> set = new HashSet<>();
        ProductBad product1 = new ProductBad("mleko", 2.8);
        ProductBad product2 = new ProductBad("mleko", 3.4);
        set.add(product1);
        set.add(product2); // produkt1 i produkt2 sa rozne ale equals dziala tak jakby byly takie same. Primo, powinny trafic do innego kubelk, secundo, albo to tego samego ale drugie na liscie
        assertEquals(1, set.size()); //powiiny byc 2
    }

    @Test
    public void good_equals_bad_hashcode_implementation() {
        Set<ProductBadSecond> set = new HashSet<>();
        ProductBadSecond product1 = new ProductBadSecond("mleko", 2.8);
        ProductBadSecond product2 = new ProductBadSecond("mleko", 3.4);
        set.add(product1);
        set.add(product2); // produkt1 i produkt2 sa rowen wiec powinny trafic do tego samego kubela i zostac nadpisay ale tak sie nie dziaje poniewaz hashciode zwraca rozna wartosc.
        assertEquals(2, set.size()); //powiiny byc 1
    }

    @Test
    public void collision() {
        Map<KeyCollision, String> mapa = new HashMap<>();
        KeyCollision one = new KeyCollision(1);
        KeyCollision two = new KeyCollision(3);
        mapa.put(one,"Andrzej");
        mapa.put(two, "Mariusz");
        mapa.get(one);
        mapa.get(two);

        //assertEquals(2, set.size()); //powinny byc 1
    }
}
