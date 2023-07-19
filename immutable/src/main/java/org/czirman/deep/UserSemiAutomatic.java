package org.czirman.deep;

public class UserSemiAutomatic implements Cloneable {
    private String name;
    private Integer age;
    private Interest interest;

    public UserSemiAutomatic(String name, Integer age, Interest interest) {
        this.name = name;
        this.age = age;
        this.interest = interest;
    }

    @Override
    public UserSemiAutomatic clone() throws CloneNotSupportedException {
        UserSemiAutomatic userCloned = (UserSemiAutomatic) super.clone();
        userCloned.interest = new Interest(interest.getName());
        return userCloned;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Interest getInterest() {
        return interest;
    }
}
