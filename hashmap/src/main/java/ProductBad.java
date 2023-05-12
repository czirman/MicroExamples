import java.util.Objects;

public class ProductBad {
    private String name;
    private double price;

    public ProductBad(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    // blednie zaimplementowany equals i hashcode, gdyz nie zostalo uwzglednionw pole price
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductBad product = (ProductBad) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
