package qualifier;

import automatic.StateBean;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {QualifierTestConfiguration.class})
public class FooServiceTest {

    @Autowired
    ApplicationContext context;

    @Test
    void serviceTest() {
        String beansActual = Arrays.stream(context.getBeanDefinitionNames()).filter(arg -> arg.equals( "fooFormatter")).findFirst().get();
        assertEquals(beansActual, "fooFormatter");

    }
}
