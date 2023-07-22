package org.czirman;

import java.io.Serializable;

public class GearWheel implements Serializable {

    private String size;
    public GearWheel(String name) {
        this.size = name;
    }

    public GearWheel (GearWheel gearWheel){
        this.size = gearWheel.getSize();
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
