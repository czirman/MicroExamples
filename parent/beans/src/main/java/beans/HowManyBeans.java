package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HowManyBeans {

    @Bean(name = "storeSouth")
    public Store storeSouth() {
        return new Store();
    }

    @Bean()
    public Store storeNorth() {
        return new Store();
    }

    @Bean()
    public Store storeWest() {
        return new Store();
    }
}
