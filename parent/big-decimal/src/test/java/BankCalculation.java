import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BankCalculation {


    @Test
    public void using_float() {
        double priceWithoutVat = 9.99;

        log("Price without VAT", priceWithoutVat);

        double priceWithVat = priceWithoutVat * 1.23;
        log("Price with VAT", priceWithVat);

        double valueWithVat = priceWithVat * 10000;
        log("Value with VAT", valueWithVat);

        double priceWithoutVat2 = valueWithVat / 1.23;
        log("Value without VAT", priceWithoutVat2);

        String priceWithVatRounded = String.format("%.2f", priceWithVat);
        log("Price with VAT", priceWithVatRounded);
        // rzutuje w górą ale czy tak chcemy
    }

    @Test
    public void using_bigdecimal() {
        BigDecimal priceWithoutVat = new BigDecimal("9.99");
        log("Price without VAT", priceWithoutVat);

        BigDecimal priceWithVat = priceWithoutVat.multiply(new BigDecimal("1.23"));
        log("Price with VAT", priceWithVat);

        priceWithVat = priceWithVat.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        log("Price with VAT (2)", priceWithVat);

        BigDecimal valueWithVat = priceWithVat.multiply(new BigDecimal(10000));
        log("Value with VAT", valueWithVat);

        BigDecimal priceWithoutVat2 = valueWithVat.divide(new BigDecimal("1.23"), BigDecimal.ROUND_HALF_EVEN);
        log("Value without VAT", priceWithoutVat2);
    }

    private void log(String text, double value) {
        System.out.println(text + ":" + value);
    }

    private void log(String text, String value) {
        System.out.println(text + ": " + value);
    }

    private void log(String text, BigDecimal value) {
        System.out.println(text + ": " + value);
    }

}