public class Account {

    private boolean active;
    private Address defaultDeliveryAddress;

    public Account(Address defaultDeliveryAddress) {
        this.defaultDeliveryAddress = defaultDeliveryAddress;
        if(defaultDeliveryAddress !=null) {
            activate();
        } else {
            this.active = false;
        }
    }

    public Account() {
        this.active = false;
    }

    public void activate() {
        this.active = true;
    }

    public boolean isActive() {
        return this.active;
    }
}
