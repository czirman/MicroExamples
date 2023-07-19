package org.czirman.staticmethod;

import org.czirman.GearWheel;

public class Carburettor {


    private String name;
    private GearWheel gearWheel;

    public Carburettor(String name, GearWheel interests) {
        this.name = name;
        this.gearWheel = interests;
    }

    public Carburettor() {

    }

    public static Carburettor newInstance(Carburettor userCopyConstructor) {
        Carburettor newUserCopyMethod = new Carburettor();
        newUserCopyMethod.name = userCopyConstructor.name;
        newUserCopyMethod.gearWheel = userCopyConstructor.gearWheel;
        return newUserCopyMethod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GearWheel getGearWheel() {
        return gearWheel;
    }

    public void setGearWheel(GearWheel gearWheel) {
        this.gearWheel = gearWheel;
    }
}
