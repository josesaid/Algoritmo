package com.mx.development.module02.lesson08;

public class ClaseNieta extends ClaseMama{

    static int x;

    public static void main(String[] args) {
        new ClaseNieta();
        System.out.println("Llamada dentro del main en la clase:  " +
                ClaseNieta.class.getSimpleName());
        new ClaseNieta();


    }

    public ClaseNieta(){
        super();
        System.out.println("3.- Llamada al constructor en la clase: "+
                ClaseNieta.class.getSimpleName());
    }

    {
        int monedas = getMonedas()-1;
        System.out.println("al nieto(a) le heredaron al final: " + monedas+" monedas. :) ");
        System.out.println("2.1- Bloque de instancia en: "+
                ClaseNieta.class.getSimpleName());
    }

    static{
        System.out.println("1.- Bloque de clase/estático en: "+
                ClaseNieta.class.getSimpleName());
        System.out.println("1.- x: " + x);
    }

    {
        System.out.println("2.2- Bloque de instancia en: " +
                ClaseNieta.class.getSimpleName());
    }
}
