import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectionCount {

    @Test
    public void should_inject_two(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBeanDefinitionNames();
    }


}
