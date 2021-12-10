package list;

import java.util.Comparator;

public class SurnameStrategySort implements Comparator<Person> {

    @Override
    public int compare(Person first, Person second) {
        return first.surname.compareTo(second.surname);
    }
}
