package model;

public class User {

    public User() {
    }

    public User(String firstName) {
        this.firstName = firstName;
    }

    private String firstName;
    public String getFirstName() {
        return firstName;
    }
}
