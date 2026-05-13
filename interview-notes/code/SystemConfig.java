import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.codility.utils")
@PropertySource("classpath:production.properties")
@Import(MaintenanceConfig.class)
public class SystemConfig {

    @Bean(initMethod = "initialize")
    public UsersRepository getUsersRepository() {
        return new UsersRepository();
    }

    @Bean("paymentsService")
    public LegacyPaymentsService legacyPaymentsService() {
        return new LegacyPaymentsService();
    }
}
