package com.mx.development.module01.lesson09;

public class Constants {

    public static void main(String[] args) {
        int x = 10;
        final  int y = 20;   //Estamos declarando una variable final (constante).
        //Una vez asignado un valor al atributo 'y', ya no podemos cambiarle el valor.

        x = 20;
        //y = 10;

        System.out.println(x);
        System.out.println(y);
    }

}
