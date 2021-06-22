import model.Company;
import model.Holding;
import model.User;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexExampleTest {

    private final ComplexExample complexExample = new ComplexExample();

    // Use classical way
    @Test
    public void nullOnBeginningClassicalUse(){
        String result = complexExample.getCompanyFirstUserName(null);
        assertEquals("not found", result);
    }

    // Use optional tests

    // leci przez całego streama ale nie ma NPE
    @Test
    public void nullOnBeginningOptionallUse(){
        String result = complexExample.getCompanyFirstUserNameOptional(null);
        assertEquals("not found", result);
    }

    private User nullUser (){
        return new User();
    }

    private User createUser (){
        return new User("user");
    }

    private Company nullCompany (){
        return new Company();
    }

    private Company createCompany (){
        return new Company(Arrays.asList(createUser()));
    }

    private Holding nullHolding (){
        return new Holding();
    }

    private Holding createHolding (){
        return new Holding(Arrays.asList(createCompany()));
    }
}
