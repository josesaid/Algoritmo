package com.codegym.lessons.module02.lesson02;

public class OverloadingExample {
    public static void main(String[] args) {
        Television tv = new Television();
        //tv.encender(new ControlRemoto());
        boolean resultado = tv.encender(new ControlRemoto(), "Duracell");
        System.out.println("resultado: " + resultado);

        //if(resultado)
        if(resultado == true)
            tv.apagar();
        else
            System.out.println("seguimos viendo la tv");
    }

}
