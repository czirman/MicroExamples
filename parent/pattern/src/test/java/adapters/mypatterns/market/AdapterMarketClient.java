package adapters.mypatterns.market;


import org.junit.Test;

public class AdapterMarketClient {

    @Test
    public void test(){
        // DisplayChart ma kompatybilny interfejs z XMLData
        XMLData xmlData = new XMLData(10,4,3);
        DisplayChart displayChart = new DisplayChart();
        displayChart.calculateAverageGoods(xmlData);

        JSONData jsonData = new JSONData(10,4,3);

        JSONDataAdapter jsonDataAdapter =  new JSONDataAdapter(jsonData);
        // Ale z jsonData już nie
        //displayChart.calculateAverageGoods(jsonData);

        // Natomiast adapter umożliwia
        displayChart.calculateAverageGoods(jsonDataAdapter);

    }
}
