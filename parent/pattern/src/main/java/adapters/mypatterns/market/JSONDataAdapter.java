package adapters.mypatterns.market;

public class JSONDataAdapter extends  XMLData{

    private JSONData jsonData;

    public JSONDataAdapter(JSONData jsonData) {
        this.jsonData = jsonData;
    }

    // Te metody w zasadzie powinny oblicząć coś co czyni kompatybilmym
    @Override
    public float getAverageShares() {
        return this.jsonData.getAverageShares();
    }

    @Override
    public float getAverageFlatPrice() {
        return this.jsonData.getAverageFlatPrice();
    }

    @Override
    public float getAverageFlatBond() {
        return this.jsonData.getAverageFlatBond();
    }


}
