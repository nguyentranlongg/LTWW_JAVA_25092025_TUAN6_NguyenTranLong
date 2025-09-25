package iuh.fit.se.ltwww_java_25092025_tuan06_nguyentranlong;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Employee emp = (Employee) context.getBean("employeeBean");
        System.out.println(emp);
    }
}
