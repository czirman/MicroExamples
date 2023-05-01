package list;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrimitiveSortTest {

    @Test
    public void collection_string_sort() {
        List sList = Arrays.asList("q", "a", "b", "z", "c");
        System.out.println("Before:" + sList);
        Collections.sort(sList);
        System.out.println("After:" + sList);
    }

    @Test
    public void collection_sort_objects() {
        List oList = Arrays.asList(
                new Person("Malinowski"),
                new Person("Ziemkiewicz"),
                new Person("Kucman")
        );
        System.out.println("Before:" + oList);
        Collections.sort(oList);
        System.out.println("After:" + oList);

    }


}
