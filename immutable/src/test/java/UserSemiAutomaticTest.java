import org.czirman.GearWheel;
import org.czirman.semiautomatic.UserSemiAutomatic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserSemiAutomaticTest {

    @Test
    public void checkDeepClone() throws CloneNotSupportedException {
        // given
        GearWheel gearWheel = new GearWheel("nano");
        GearWheel i2 = gearWheel;
        UserSemiAutomatic userSemiAutomatic = new UserSemiAutomatic("Marcin",45, gearWheel);

        // when
        UserSemiAutomatic clon = userSemiAutomatic.clone();

        //then
        assertEquals(45, clon.getAge());
        assertEquals("Marcin", clon.getName());
        assertEquals("nano", clon.getInterest().getSize());
        assertNotEquals(userSemiAutomatic.getInterest(), clon.getInterest());

    }
}
