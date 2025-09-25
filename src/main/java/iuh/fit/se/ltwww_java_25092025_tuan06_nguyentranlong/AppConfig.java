package iuh.fit.se.ltwww_java_25092025_tuan06_nguyentranlong;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // báo cho Spring đây là file config
public class AppConfig {

    @Bean
    public Address address() {
        return new Address("Da Nang", "DN", "Vietnam");
    }

    @Bean
    public Employee employee() {
        // inject Address vào Employee
        return new Employee(3, "Le Van C", address());
    }
}

