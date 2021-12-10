package map;

import java.util.Comparator;

public class NameStrategySort implements Comparator<City> {

    @Override
    public int compare(City first, City second) {
        return first.name.compareTo(second.name);
    }
}
