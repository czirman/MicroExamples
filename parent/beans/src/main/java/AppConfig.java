import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "lol")
    public Store store() {
        return new Store();
    }

    @Bean()
    public Store store1() {
        return new Store();
    }

}
