package beans;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HowManyBeansTest {

    @Test
    public void howManyBeans() {
        ApplicationContext context = new AnnotationConfigApplicationContext(HowManyBeans.class);
        context.getBeanDefinitionNames();
    }
}
