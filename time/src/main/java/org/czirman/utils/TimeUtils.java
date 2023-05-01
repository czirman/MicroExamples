package org.czirman.utils;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;

public class TimeUtils {

    private static Clock CLOCK = Clock.systemDefaultZone();
    private static final TimeZone REAL_TIME_ZONE = TimeZone.getDefault();

    public static LocalDateTime currentDateTime() {

        return LocalDateTime.now(CLOCK);
    }

    public static void useMockTime(LocalDateTime dateTime, ZoneId zoneId) {
        Instant instant = dateTime.atZone(zoneId).toInstant();
        CLOCK = Clock.fixed(instant, zoneId);
        TimeZone.setDefault(TimeZone.getTimeZone(zoneId));
    }

}
