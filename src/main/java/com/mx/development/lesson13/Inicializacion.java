package com.mx.development.lesson13;

public class Inicializacion {
    int variable ;

    static {
        System.out.println("bloque de clase 1");
    }
    public Inicializacion(){
        System.out.println("Inicializacion constructor");
    }

    {
        System.out.println("bloque de instancia 1");
    }

    static {
        System.out.println("bloque de clase 2");
    }
    public static void main(String[] args) {
            new Inicializacion();
    }

    {
        System.out.println("bloque de instancia 2");
    }

    static {
        System.out.println("bloque de clase 3");
    }

    //JSR - Java Specification Request

}
