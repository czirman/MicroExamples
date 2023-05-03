import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexExampleTest {

    private final ComplexExample complexExample = new ComplexExample();

    // Use classical way
    @Test
    public void nullOnBeginningClassicalUse() {
        String result = complexExample.getCompanyFirstUserName(null);
        assertEquals("not found", result);
    }

    // Use optional tests
    // leci przez całego streama ale nie ma NPE
    @Test
    public void nullOnBeginningOptionallUse() {
        String result = complexExample.getCompanyFirstUserNameOptional(null);
        assertEquals("not found", result);
    }

}
