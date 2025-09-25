package iuh.fit.se.ltwww_java_25092025_tuan06_nguyentranlong;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("iuh.fit.se.ltwww_java_25092025_tuan06_nguyentranlong") // thay bằng package thật sự của bạn
public class MainAppAnnotation {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MainAppAnnotation.class);

        Employee emp = context.getBean(Employee.class);
        System.out.println(emp);
    }
}

