package com.mx.development.module02.lesson08;

import lombok.Data;

@Data
public class ClaseAbuela {
    private int monedas = 10;
    {
        System.out.println("2.1- Bloque de instancia en: "+
                ClaseAbuela.class.getSimpleName());
    }

    public ClaseAbuela(){
        System.out.println("Constructor de: "
                + ClaseAbuela.class.getSimpleName());

        System.out.println("monedas: " + monedas);
    }

    static{
        System.out.println("1.- Bloque de clase/estático en: "+
                ClaseAbuela.class.getSimpleName());
    }

    {
        System.out.println("2.2- Bloque de instancia en: "+
                ClaseAbuela.class.getSimpleName());
    }
}
