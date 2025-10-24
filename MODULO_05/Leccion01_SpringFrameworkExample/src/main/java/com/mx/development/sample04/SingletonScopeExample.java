package com.mx.development.sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author josesaidolanogarcia
 */
public class SingletonScopeExample {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AwesomeBeans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("singletonHelloWorld");

        objA.setMessage("I'm object A");
        System.out.println(objA.getMessage());
        System.out.println("------------------------------------------------");

        HelloWorld objB = (HelloWorld) context.getBean("singletonHelloWorld");
        objB.setMessage("I'm object B");
        System.out.println(objB.getMessage());
        System.out.println(objA.getMessage());

        objA.setMessage("I'm object aaaaa");
        System.out.println("------");
        System.out.println(objB.getMessage());
        System.out.println(objA.getMessage());
    }
}
