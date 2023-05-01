package map;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CityTest {

    @Test
    public void map_order() {
        Comparator sortStrategy = new NameStrategySort();
        Map usualMap = new TreeMap<String, City>(sortStrategy);
        usualMap.put("Płock", new City("Plock"));
        usualMap.put("Warszawa", new City("Warszawa"));
        usualMap.put("Sopot", new City("Sopot"));
        usualMap.put("Kolno", new City("Kolno"));
        usualMap.put("Białystok", new City("Białystok"));

    }
}
