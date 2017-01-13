import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by tom on 17-1-12.
 */
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("cn.com.xbed.idea")
public class ServerApi {
    public static void main(String[] args) {
        SpringApplication.run(ServerApi.class, args);
    }
}
