import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class FromRancheExample {

    @Test
    public void  gogog(){

        String s = "123456789012345678901234567890";
        BigDecimal bd = new BigDecimal(s);
        System.out.println(bd);
        double d = Double.parseDouble(s);
        System.out.println(d);

    }
}
