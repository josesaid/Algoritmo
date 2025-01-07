package com.mx.development.module01.lesson13;

public class InicializacionSubclase extends Inicializacion{
    public InicializacionSubclase(){
        System.out.println("InicializacionSubclase constructor");
    }
    {
        System.out.println("InicializacionSubclase bloque de instancia 1");
    }
    static {
        System.out.println("InicializacionSubclase bloque de clase 1");
    }

    static {
        System.out.println("InicializacionSubclase bloque de clase 2");
    }

    {
        System.out.println("InicializacionSubclase bloque de instancia 2");
    }

    static {
        System.out.println("InicializacionSubclase bloque de clase 3");
    }

    public static void main(String[] args) {
        new InicializacionSubclase();

    }

}
