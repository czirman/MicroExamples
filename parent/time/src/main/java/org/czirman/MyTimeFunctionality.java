package org.czirman;

import org.czirman.utils.TimeUtils;

import java.time.*;

public class MyTimeFunctionality {

    public Boolean isShopOpen() {
        LocalDateTime timeNow = TimeUtils.currentDateTime();
        int hour = timeNow.atZone(ZoneOffset.UTC).getHour();
        if (hour > 8 && hour < 16) {
            return true;
        } else {
            return false;
        }
    }

    public void listOfMethod() {
        LocalDate.now();
        LocalTime.now();
        LocalDateTime.now();
        OffsetDateTime.now();
        ZonedDateTime.now();
        Instant.now();
    }
}
// https://dzone.com/articles/mock-java-datetime-for-testing

// kurwa gruby temat
// https://stackoverflow.com/questions/24491260/mocking-time-in-java-8s-java-time-api

// https://www.baeldung.com/java-override-system-time
// badechuj pojebany w bład wprowadza

//https://stackoverflow.com/questions/4482315/why-doesnt-mockito-mock-static-methods