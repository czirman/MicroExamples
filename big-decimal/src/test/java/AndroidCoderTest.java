import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class AndroidCoderTest {

    @Test
    public void small_numbers(){
        float floatNumber = 0.1f;
        double doubleNumber = 0.1;
        System.out.format("Java liczbę 0.1 przedstawia na ekranie tak:%n", floatNumber);
        System.out.format("float: %f%n", floatNumber);
        System.out.format("double: %f%n", doubleNumber);

        System.out.format("%nale w rzeczywistości zaokrągla przechowywaną w zmiennej jej faktyczną wartość:%n");
        System.out.format("float: %s%n", new BigDecimal(floatNumber));
        System.out.format("double: %s%n", new BigDecimal(doubleNumber));

        System.out.format("%nDlatego porównanie liczby 0.1f i 0.100000001490116119384765625f da wynik pozytywny co nie jest prawdą w sensie matematycznym:%n");
        boolean isEqual = 0.1f == 0.100000001490116119384765625f;
        System.out.format("0.1f == 0.100000001490116119384765625f -> %b%n", isEqual);
    }

    @Test
    public void big_numbers(){
        float floatNumber = 100000000000f;
        double doubleNumber = 100000000000d;
        System.out.format("Java liczbę 100000000000 przedstawia na ekranie tak:%n", floatNumber);
        System.out.format("float: %f%n", floatNumber);
        System.out.format("double: %f%n", doubleNumber);

        System.out.format("%nale w rzeczywistości zaokrągla przechowywaną w zmiennej jej faktyczną wartość:%n");
        System.out.format("float: %s%n", new BigDecimal(floatNumber));
        System.out.format("double: %s%n", new BigDecimal(doubleNumber));

        System.out.format("%nDlatego porównanie liczby 0.1f i 0.100000001490116119384765625f da wynik pozytywny co nie jest prawdą w sensie matematycznym:%n");
        boolean isEqual = 0.1f == 0.100000001490116119384765625f;
        System.out.format("0.1f == 0.100000001490116119384765625f -> %b%n", isEqual);

    }

    @Test
    public void loss_precision(){
        float floatNumber = 10000000.17f;
        double doubleNumber = 10000000000000000.17d;

        System.out.format("Rzeczywiste wartości przechowywane w zmiennej:%n");
        System.out.format("float: %s%n", new BigDecimal(floatNumber));
        System.out.format("double: %s%n", new BigDecimal(doubleNumber));
    }

    @Test
    public void loss_accuracy(){
        double sum = 0;
        for(int i = 0 ; i<10; i++)
        {
            sum += 0.1;
        }
        System.out.println(sum);
        System.out.println(1.0);
    }

    @Test
    public void initialize_bigdecimal(){
        BigDecimal wrongNumber = new BigDecimal(0.1);
        System.out.format("bigdecimal: %s%n", wrongNumber);
        BigDecimal goodNumber = new BigDecimal("0.1");
        System.out.format("bigdecimal: %s%n", goodNumber);
    }
}




