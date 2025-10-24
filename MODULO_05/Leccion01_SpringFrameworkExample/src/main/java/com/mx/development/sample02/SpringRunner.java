package com.mx.development.sample02;

import com.mx.development.sample02.domain.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunner {
    public static void main(String[] args) {
        Car toyota = getCarFromXml();
        System.out.println(toyota);
        System.out.println("----------------------------");
        toyota = getCarFromJavaConfig();
        System.out.println(toyota);
    }

    private static Car getCarFromJavaConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(Car.class);
    }

    private static Car getCarFromXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor_di.xml");
        return context.getBean(Car.class);
    }

}
