import java.util.Collections;
import java.util.List;

public final class ImmutableAddress {

    private final String street;
    private final String city;
    private List<String> list;

    public ImmutableAddress(String street, String city, List<String> list) {
        this.street = street;
        this.city = city;
        this.list = Collections.unmodifiableList(list);
        //this.list = list;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public List<String> getList() {
        return list;
    }

}
