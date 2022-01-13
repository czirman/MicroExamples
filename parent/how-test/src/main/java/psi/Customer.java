package psi;

public class Customer {
    private final String email;
    private boolean prefersEmails;

    public Customer(String email, boolean prefersEmails) {
        this.email = email;
        this.prefersEmails = prefersEmails;
    }

    public String getEmail() {
        return email;
    }

    public boolean prefersEmails() {
        return prefersEmails;
    }
}
