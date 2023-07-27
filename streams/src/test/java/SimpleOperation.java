import model.Increme;
import model.Klasa;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SimpleOperation {

    @Test
    public void how_to_sort_primitive(){
        Stream.of(3,4,6,8,9,1).sorted().forEach(System.out::println);
    }

    @Test
    // TODO wywala wyjatek zwiazany z jedna z waznych cech strumieni
    public void test1() {

        Stream<Klasa> stream = Arrays.asList(new Klasa(1), new Klasa(4), new Klasa(2), new Klasa(10), new Klasa(19)).stream();
        Stream<Object> b = stream.map(arg -> arg.getHup());//.collect(Collectors.toList());
        b.collect(Collectors.toList());

        Stream<String> stringStream = Stream.of("A", "B", "C", "D");
        Stream<String> result1 = stringStream.filter(arg -> arg.equals("A"));

        result1.collect(Collectors.toList());
        //result1.findFirst();

    }

    @Test
    public void how_distinct_work() {
        Integer arr[] = {2, 5, 7, 8, 3, 5, 8, 90, 3, 6};
        List<Integer> result = Stream.of(arr).distinct().collect(Collectors.toList());
        System.out.println(result);
    }

    @Test
    public void how_to_extract_asci_code() {
        String all = "AA";
        all.chars().mapToObj(c -> (char)c).forEach(System.out::println);
    }

    @Test
    public void how_to_extract_asci_code_steep_by_steep() {
        String all = "AA";
        IntStream stream = all.chars();
        stream.mapToObj(c -> (char)c).forEach(System.out::println);
    }

    @Test
    public void use_dodot_operator_in_Integer() {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        List<Integer> lengths = fruits.stream()
                .map(String::length)// TODO dlaczego tu length nie musi byc metodą statyczną
                .collect(Collectors.toList());
        System.out.println(lengths);
    }

    @Test
    public void how_flatmap_work() {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        List<Character> chars = fruits.stream()
                .flatMap(s -> s.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println(chars);
    }

    @Test
    public void how_flatmap_work_steep_by_steep() {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        List<Character> chars = fruits.stream()
                .flatMap(
                        arg -> {
                            IntStream intStream = arg.chars();
                            return intStream.mapToObj(c -> (char) c);
                        }
                ).collect(Collectors.toList());
        System.out.println(chars);
    }

    @Test
    public void flatmap_on_reference_type() {
        Increme arr[] = {new Increme(5), new Increme(2), new Increme(3), new Increme(4), new Increme(1)};
        List<Increme> streamReferential = Arrays.stream(arr).flatMap(arg ->
        {
            Increme internal[] = {new Increme(10), arg};
            return Arrays.stream(internal);
        }).collect(Collectors.toList());
        System.out.println(streamReferential);
    }

    @Test
    public void using_double_dot_example() {
        Integer tab[] = {3,1,5,7,8,9,0,1,4};
        Stream<Integer> stream = Stream.of(tab);
        List<Integer> result = stream.map(SimpleOperation::transform).collect(Collectors.toList());
        System.out.println(result);
    }

    static Integer transform(Integer integer){
        return ++integer;
    }
}
