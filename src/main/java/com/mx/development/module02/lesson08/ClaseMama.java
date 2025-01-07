package com.mx.development.module02.lesson08;

public class ClaseMama extends ClaseAbuela{
    {
        System.out.println("Bloque de instancia 01 en: " + ClaseMama.class.getSimpleName());
        int monedas = getMonedas() -2;
        setMonedas(monedas);
        System.out.println(""+ monedas + "Monedas en " + ClaseMama.class.getSimpleName());
    }
    static{
        System.out.println("Bloque estático 01:" + ClaseMama.class.getSimpleName());
    }

    static{
        System.out.println("Bloque estático 02:" + ClaseMama.class.getSimpleName());
    }

    {
        System.out.println("Bloque de instancia 02 en: " + ClaseMama.class.getSimpleName());
    }

    public ClaseMama(){
        super();
    }
}
