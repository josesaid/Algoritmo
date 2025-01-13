package com.codegym.lessons.module02.lesson04;

public interface InterfaceExample01 {
    default void m1(){
        System.out.println("HOla soy el método m1");
    }

    //public static final
    int variableEnUnaInterface = 10;

}
