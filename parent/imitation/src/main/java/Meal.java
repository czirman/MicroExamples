public class Meal {
    private int price;
    private int quantity;

    public Meal() {
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    int sumPrice() {
        return getPrice() * getQuantity();
    }
}
