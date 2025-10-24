package com.mx.development.sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author josesaidolanogarcia
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        AnyService anyService = ctx.getBean(AnyService.class);

        String result = anyService.doSomething();
        System.out.println("result: "  +result);
    }
}