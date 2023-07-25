import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

public class StaticField {

    private Random random = new Random();
    public static final ArrayList<Double> list = new ArrayList<Double>(1000000);

    // wyskoczy out of memory z parametrem -Xmx16M
    // TODO ten test nie dziala bez parmatetru pow, nie ma sensu go razem odpalac
    //@Test
    public void givenStaticField_whenLotsOfOperations_thenMemoryLeak() throws InterruptedException {
        for (int i = 0; i < 1000000; i++) {
            list.add(random.nextDouble());
        }

        System.gc();
        Thread.sleep(10000); // to allow GC do its job
    }
}
//https://stackify.com/memory-leaks-java/
