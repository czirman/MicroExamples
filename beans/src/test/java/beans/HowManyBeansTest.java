package beans;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HowManyBeansTest {

    @Test
    public void howManyBeans() {
        ApplicationContext context = new AnnotationConfigApplicationContext(HowManyBeans.class);
        List<String> beans = Arrays.stream(context.getBeanDefinitionNames())
                .filter(bean -> bean.matches("storeSouth|storeNorth|storeWest"))
                .collect(Collectors.toList());
        assertEquals(3, beans.size());
        assertEquals("storeSouth", beans.get(0));
        assertEquals("storeNorth", beans.get(1));
        assertEquals("storeWest", beans.get(2));
    }
}
