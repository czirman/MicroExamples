package list;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReferenceSortTest {



    @Test
    public void collection_surname_strategy() {
        List oList = Arrays.asList(
                new Person("Malinowski"),
                new Person("Ziemkiewicz"),
                new Person("Kucman")
        );
        System.out.println("Before:"+oList);
        Collections.sort(oList, new SurnameStrategySort());
        System.out.println("After:"+oList);

    }


    @Test
    public void collection_name_strategy() {
        List oList = Arrays.asList(
                new Person("Malinowski", "Andrzej"),
                new Person("Ziemkiewicz", "Rafał"),
                new Person("Kucman", "Marcin")
        );
        System.out.println("Before:"+oList);
        Collections.sort(oList, new NameStrategySort());
        System.out.println("After:"+oList);
    }
}
