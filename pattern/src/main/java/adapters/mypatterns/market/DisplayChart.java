package adapters.mypatterns.market;

public class DisplayChart {

    public void calculateAverageGoods(XMLData data){
        float average = (data.getAverageFlatBond()
            +data.getAverageFlatPrice()
            +data.getAverageFlatPrice())/3;
        System.out.println(average);
    }
}
