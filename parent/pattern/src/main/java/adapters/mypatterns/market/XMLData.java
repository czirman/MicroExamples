package adapters.mypatterns.market;

public class XMLData {

    // Nie wiem po chuj mu potrzeby defaultowy konstruktor, w skopiowanym przykładzie działą
    public XMLData() {
    }

    public XMLData(float averageShares, float averageFlatPrice, float averageFlatBond) {
        this.averageShares = averageShares;
        this.averageFlatPrice = averageFlatPrice;
        this.averageFlatBond = averageFlatBond;
    }

    public float getAverageShares() {
        return averageShares;
    }

    public float getAverageFlatPrice() {
        return averageFlatPrice;
    }

    public float getAverageFlatBond() {
        return averageFlatBond;
    }

    private float averageShares; //average quotation of shares
    private float averageFlatPrice;
    private float averageFlatBond;

}
