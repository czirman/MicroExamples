import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


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
        Set<Product> set = new HashSet<>();

        Product product1 = new Product("mleko", 2.8);
        Product product2 = new Product("mleko", 3.4);

        set.add(product1);
        set.add(product2); // produkt1 i produkt2 sa równa. Nie powinno dodawac

        product1.equals(product2);

        System.out.println(set);

    }
}

