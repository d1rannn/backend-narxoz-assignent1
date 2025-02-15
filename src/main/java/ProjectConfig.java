import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    Person person() {
        var p = new Person();
        p.setName("John Doe");
        return p;
    }
}
