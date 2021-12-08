import java.util.Comparator;

public class NameStrategySort implements Comparator<Person> {

    @Override
    public int compare(Person first, Person second) {
        return first.name.compareTo(second.name);
    }
}
