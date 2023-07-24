import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperdolimyStreamyWsieTest {

    @Test
    public void klon(){
        Integer arr[] = {2,5,7,8,3,5,8,90,3,6};
        List<Integer> result = Stream.of(arr).distinct().collect(Collectors.toList());
        System.out.println(result);
    }

    @Test
    public void klon1(){
        Increme arr[] = {new Increme(1),new Increme(2),new Increme(3),new Increme(4),new Increme(4)};
        //List<Increme> res = Stream.of(arr).distinct().collect(Collectors.;
        //System.out.println(res);

    }

    @Test
    public void klon2(){
        Increme arr[] = {new Increme(1),new Increme(2),new Increme(3),new Increme(4),new Increme(5)};
        //List<Increme> res = Stream.of(arr).map(a-> a.dodaj()).collect(Collectors.toList());
    }

    @Test
    public void klon3(){
        Increme arr[] = {new Increme(5),new Increme(2),new Increme(3),new Increme(4),new Increme(1)};
        List list = Arrays.asList(arr);
        //Collections.sort(list);
        System.out.println(list);


    }

    @Test
    public void klon4() throws UnsupportedEncodingException {
        String all ="AA";
        char[] iti = all.toCharArray();
        Stream<Character> charStream = new String(iti).chars().mapToObj(i -> (char)i);

        String fdsafdf= "SSSS";
        fdsafdf.chars().map(operand -> (char)operand);
        Integer str =charStream.map(arg->{
            return (int)arg;
        })
                .collect(Collectors.summingInt(arg->arg));

        System.out.println(str);


    }

}
