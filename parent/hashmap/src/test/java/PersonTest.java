import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void add_different_value_one_bucket(){
        Person person1 =  new Person(1, "Marcin", "Kuc");
        Person person2 =  new Person(2, "Marcin", "Lolo");
        Map<Integer, Person> mapa = new HashMap<Integer, Person>();
        mapa.put(1, person1);
        mapa.put(2, person2);
        Person person3 = person2;
        person2 =  new Person(2, "Marcin", "Lolo Version2");
        mapa.put(2, person2);
        assertEquals(true, person2.equals(person3));
        assertEquals(mapa.size() , 2);
    }
}
