import model.Fraud;
import model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewRepost {

    @Test
    public void should_get_five_not_frauded() {
        Fraud fraud = new Fraud();

        List<Integer> report = fraud.getStatusPeople()
                .stream()
                .filter(report1 -> report1.getFrauded() == false)
                .map(report1 -> report1.getId())
                .collect(Collectors.toList());

        List<Person> personStream =
                getSortedFromRepo().filter(person -> report.contains(person.getId()))
                        .limit(5).collect(Collectors.toList());

    }

    private Stream<Person> getSortedFromRepo() {
        return Stream.of(
                new Person(1),
                new Person(2),
                new Person(3),
                new Person(4),
                new Person(5),
                new Person(6),
                new Person(7),
                new Person(8),
                new Person(9),
                new Person(10),
                new Person(11)
        );

    }
}
