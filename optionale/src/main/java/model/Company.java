package model;

import java.util.List;

public class Company {

    public Company() {
    }
    public Company(List<User> users) {
        this.users = users;
    }

    private List<User> users;
    public List<User> getUsers() {
        return users;
    }
}
