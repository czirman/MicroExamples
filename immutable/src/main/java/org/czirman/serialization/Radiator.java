package org.czirman.serialization;

import org.czirman.GearWheel;

import java.io.Serializable;

public class Radiator implements Serializable {

    private String name;

    private GearWheel gearWheel;

    public Radiator(String name, GearWheel gearWheel) {
        this.name = name;
        this.gearWheel = gearWheel;
    }

    public Radiator deepCopy() {
        return SerializationService.deepCopy(this);
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
