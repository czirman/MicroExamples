package automatic;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ServiceUpTest {

    @Test
    public void should_inject_all_by_scan() {
         var ctx = new AnnotationConfigApplicationContext(SpringComponentScanApp.class);
        var stateBean = (StateBean) ctx.getBean("stateBean");

        assertNotNull(stateBean);
        assertNotNull(stateBean.cityBean);
        ctx.close();
    }
}
