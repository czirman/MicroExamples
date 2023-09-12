package qualifier;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {QualifierTestConfiguration.class})
public class FooServiceTest {

   /* @Autowired
    StateBean stateBean;*/

    @Test
    void serviceTest() {
        System.out.println();
    }
}
