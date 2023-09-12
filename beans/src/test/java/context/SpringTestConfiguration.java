package context;

import automatic.StateBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Configuration
@ComponentScan(basePackages = "automatic")
public class SpringTestConfiguration {

}
