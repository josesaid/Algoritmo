package com.mx.development.sample03;

import com.mx.development.sample03.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author josesaidolanogarcia
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Creating an object of Employee class
        Employee e = (Employee)applicationContext.getBean("employee");
        String pais = e.getAddress().getCountry();
        System.out.println("El pais es: " + pais);
        System.out.println("------------------------------------");
        // Calling print() method inside main() method
        e.display();
    }
}
