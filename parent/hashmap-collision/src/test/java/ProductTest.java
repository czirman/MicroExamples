import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


import static org.junit.jupiter.api.Assertions.assertEquals;
public class ProductTest {

    @Test
    public void example_from_site() {
        Product prod1 = new Product("Czekolada", 2.99);
        Product prod2 = new Product("Czekolada1", 2.99);

        System.out.println(prod1.equals(prod2));
        System.out.println(prod1.hashCode()); //2018699554
        System.out.println(prod2.hashCode()); //1311053135

        Map<Product, Product> mapa = new HashMap<Product, Product>();
        mapa.put(prod1,prod1);
        mapa.put(prod2,prod2);
        assertEquals(2, mapa.size());
    }

    @Test
    public void example_from_site_second() {
        HashSet<Product> set = new HashSet<>();
        set.add(new Product("mleko", 2.8));
        set.add(new Product("mleko", 3.2));

        System.out.println(set);
    }
}
//https://nullpointerexception.pl/pytania-rekrutacyjne-jak-dziala-hashmapa-w-javie/
//https://cupofcodes.pl/co-powinienes-wiedziec-o-hash-map/
//https://javastart.pl/baza-wiedzy/programowanie-obiektowe/metoda-hashcode

/*
Rozkładanie równomierne było błędnym myśleniem
Kolizję mamy wtedy gdy dwa obiekty mają ten sam hashcode

Unikalność- to jest zupełnie co innego

 */
