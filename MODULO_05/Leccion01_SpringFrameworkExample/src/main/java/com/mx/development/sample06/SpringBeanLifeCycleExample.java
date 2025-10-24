package com.mx.development.sample06;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author josesaidolanogarcia
 */
public class SpringBeanLifeCycleExample {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanLifeCycle.xml");

        HelloWorld obj = (HelloWorld) context.getBean("miHermosoBean");
        System.out.println("llamando a getMessage: " + obj.getMessage());
        context.registerShutdownHook();
    }

}
