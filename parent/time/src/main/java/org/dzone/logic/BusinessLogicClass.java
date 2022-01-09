package org.dzone.logic;

import org.dzone.utils.Time;

public class BusinessLogicClass {
    public String getLastUpdatedTime() {
        return "Last Updated At " + Time.currentDateTime();
    }
}
