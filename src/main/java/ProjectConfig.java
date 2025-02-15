import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Person person() {
        var p = new Person();
        p.setName("John Doe");
        return p;
    }
}
