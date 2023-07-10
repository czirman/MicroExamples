package org.czirman;

import org.czirman.utils.TimeUtils;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TimeTest {

    private final MyTimeFunctionality timeFunctionality = new MyTimeFunctionality();

    private final static LocalDateTime HOUR_BEFOFE_16 = LocalDateTime.of(2020, Month.APRIL, 1, 12, 45);
    private final static LocalDateTime HOUR_AFTER_16 = LocalDateTime.of(2020, Month.APRIL, 1, 18, 45);
    private final static ZoneId ZONE_ID = ZoneId.of("Europe/Kiev");

    @Test
    public void test() {
        Instant test = Instant.now(Clock.fixed(Instant.parse("2018-08-22T10:00:00Z"), ZoneOffset.UTC));
        test.getNano();
        timeFunctionality.isShopOpen();
    }

    @Test
    public void givenTime8To16_whenKnock_thenShopOpen() {

        TimeUtils.useMockTime(HOUR_BEFOFE_16, ZONE_ID);
        Boolean open = timeFunctionality.isShopOpen();

        assertTrue(open);
    }

    @Test
    public void givenTimeAfter16_whenKnock_thenShopClosed() {
        TimeUtils.useMockTime(HOUR_AFTER_16, ZONE_ID);
        Boolean open = timeFunctionality.isShopOpen();
        assertFalse(open);
    }



}
