package com.mx.development.lesson19;

public class Singleton {

    //eager | lazy
    private final static Singleton   INSTANCIA = new Singleton();; //Eager
    private Singleton(){

    }

    //public static getSingletonExample()
    public static Singleton getInstance(){
        //if(INSTANCIA ==null)

        System.out.println(INSTANCIA.hashCode());
        return INSTANCIA;
    }

    @Override
    public int hashCode() {
        return 7*5*3;
    }
}
