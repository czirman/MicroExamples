public final class ImmutableAddress {

    private final String street;
    private final String city;

    public ImmutableAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

}
