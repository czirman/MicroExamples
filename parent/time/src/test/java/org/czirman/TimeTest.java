package org.czirman;

import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//@ExtendWith(MockTimeExtension.class)
public class TimeTest {

    private final MyTimeFunctionality timeFunctionality = new MyTimeFunctionality();

    @Test
    public void test() {
        Instant test = Instant.now(Clock.fixed(Instant.parse("2018-08-22T10:00:00Z"), ZoneOffset.UTC));
        test.getNano();
        timeFunctionality.isShopOpen();
    }

    //@Test
    public void givenTime8To16_whenKnock_thenShopOpen() {
        Boolean open = timeFunctionality.isShopOpen();

        String instantExpected = "2014-12-22T10:15:30Z";
        Clock clock = Clock.fixed(Instant.parse(instantExpected), ZoneId.of("UTC"));

        Instant instant = Instant.now(clock);

        assertTrue(open);
    }

    //@Test
    public void givenTimeAfter16_whenKnock_thenShopClosed() {
        Boolean open = timeFunctionality.isShopOpen();
        assertFalse(open);
    }
}
