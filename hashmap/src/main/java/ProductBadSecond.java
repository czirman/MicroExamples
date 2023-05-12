import java.util.Objects;

public class ProductBadSecond {
    private String name;
    private double price;

    public ProductBadSecond(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    // tym razem uznajemy ze produkty sa rowne gdy maja taka sama nazwe, a nie bierzemy opod uwage ceny. Wiec equals jest dobrze zaimplementowany a hascode zle
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductBadSecond product = (ProductBadSecond) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
