package org.dzone.utils;

import java.time.*;
import java.util.TimeZone;

public class Time {

    private static Clock CLOCK = Clock.systemDefaultZone();
    private static final TimeZone REAL_TIME_ZONE = TimeZone.getDefault();
    public static LocalDate currentDate() {
        return LocalDate.now(getClock());
    }

    public static LocalTime currentTime() {
        return LocalTime.now(getClock());
    }

    public static LocalDateTime currentDateTime() {

        return LocalDateTime.now(getClock());
    }

    public static OffsetDateTime currentOffsetDateTime() {
        return OffsetDateTime.now(getClock());
    }

    public static ZonedDateTime currentZonedDateTime() {
        return ZonedDateTime.now(getClock());
    }

    public static Instant currentInstant() {
        return Instant.now(getClock());
    }

    public static long currentTimeMillis() {
        return currentInstant().toEpochMilli();
    }

    // Zbyt niebezpieczna do uzycia na produkcji
    public static void useMockTime(LocalDateTime dateTime, ZoneId zoneId) {
        Instant instant = dateTime.atZone(zoneId).toInstant();
        CLOCK = Clock.fixed(instant, zoneId);
        TimeZone.setDefault(TimeZone.getTimeZone(zoneId));
    }

    public static void useSystemDefaultZoneClock() {
        TimeZone.setDefault(REAL_TIME_ZONE);
        CLOCK = Clock.systemDefaultZone();
    }

    private static Clock getClock() {
        return CLOCK;
    }

}
