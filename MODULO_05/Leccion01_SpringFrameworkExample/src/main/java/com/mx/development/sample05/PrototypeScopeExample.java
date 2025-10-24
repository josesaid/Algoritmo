package com.mx.development.sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeScopeExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AwesomeBeans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("prototypeHelloWorld");
        objA.setMessage("I'm object A aaaaaaa");
        System.out.println(objA.getMessage());

        System.out.println(">>>>>>>>>>>>>>");

        HelloWorld objB = (HelloWorld) context.getBean("prototypeHelloWorld");
        objB.setMessage("I'm object B bbbbbbbbbb");

        System.out.println(objB.getMessage());
        System.out.println(objA.getMessage());
    }
}
