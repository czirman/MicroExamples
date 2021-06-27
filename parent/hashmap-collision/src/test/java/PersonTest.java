import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void add_different_value_one_bucket(){
        Person d1 =  new Person(1, "Marcin", "Kuc");
        Person d2 =  new Person(2, "Marcin", "Lolo");
        Map<Person, Person> mapa = new HashMap<Person, Person>();
        mapa.put(d1, d1);
        mapa.put(d2, d2);
        Person d3 = d2;
        d2 =  new Person(2, "Marcin", "Lolo Version2");
        mapa.put(d2, d2);
        assertEquals(true, d2.equals(d3));
        assertEquals(mapa.size() , 2);
    }
}
