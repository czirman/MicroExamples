package org.czirman.semiautomatic;

import org.czirman.GearWheel;

public class UserSemiAutomatic implements Cloneable {
    private final String name;
    private final Integer age;
    private GearWheel gearWheel;

    public UserSemiAutomatic(String name, Integer age, GearWheel gearWheel) {
        this.name = name;
        this.age = age;
        this.gearWheel = gearWheel;
    }

    @Override
    public UserSemiAutomatic clone() throws CloneNotSupportedException {
        UserSemiAutomatic userCloned = (UserSemiAutomatic) super.clone();
        userCloned.gearWheel = new GearWheel(gearWheel.getSize());
        return userCloned;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public GearWheel getInterest() {
        return gearWheel;
    }
}
