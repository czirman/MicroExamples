import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ClingonsTest {

    /*
    Sprzedajemy klingonom 10 battleshipów po 80 cebulionow, przy użyciu float double i Bigdecimal, i patrzymy na ile i kto został oszukany
     */

    @Test
    public void sell_float(){
        //given
        float nrBattleships = 10f;
        float price = 80000000000000000000000000000f;

        float overallPrice = nrBattleships * price;
        BigDecimal overallPriceB = getAccurateResult(String.valueOf(nrBattleships), String.valueOf(price));
        BigDecimal differenceB = overallPriceB.subtract(new BigDecimal(overallPrice));
        System.out.format("Oszukali nas na %szł %n", differenceB);

    }

    @Test
    public void sell_double(){
        //given
        double nrBattleships = 10f;
        double price = 80000000000000000000000000000f;

        double overallPrice = nrBattleships * price;
        BigDecimal overallPriceB = getAccurateResult(String.valueOf(nrBattleships), String.valueOf(price));
        BigDecimal differenceB = overallPriceB.subtract(new BigDecimal(overallPrice));
        System.out.format("Oszukali nas na %szł %n", differenceB);
        System.out.format("Czyli zaplacili tyle ile trzeba");
    }

    @Test
    public void sell_bigdecimal(){
        //given
        BigDecimal nrBattleships = new BigDecimal("10");
        BigDecimal price = new BigDecimal("80000000000000000000000000000");

        BigDecimal overallPriceB = getAccurateResult(String.valueOf(nrBattleships), String.valueOf(price));
        BigDecimal differenceB = overallPriceB.subtract(overallPriceB);
        System.out.format("Oszukali nas na %szł %n", differenceB);

    }



    private BigDecimal getAccurateResult(String nrBattleship, String  price){
        BigDecimal nrB = new BigDecimal(nrBattleship);
        BigDecimal priceB= new BigDecimal(price);

        return nrB.multiply(priceB);
    }
}


