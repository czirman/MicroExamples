package org.czirman.constructor;

import org.czirman.GearWheel;

import java.io.Serializable;

public class Engine implements Serializable {
    private String name;
    private GearWheel gearWheel;

    public Engine(String name, GearWheel gearWheel) {
        this.name = name;
        this.gearWheel = gearWheel;
    }

    public Engine (Engine engine){
        this.name = engine.getName();
        this.gearWheel = engine.gearWheel;
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
