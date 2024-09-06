package com.mx.development.lesson13;

public class Codigo {
    int x=10;   //variable de instancia
    public static void main(String[] args) {
        int x = 20; //variable local, temporal, de stack, de pila

        new Codigo().metodo();  //metodo de instancia
        Codigo.metodo();        //metodo de clase.

        //new Codigo().metodo2();
        //metodo2();
    }

    static int x3 = 30; //variable de clase

    static void metodo(){   //método de clase
        System.out.println("x3:" + x3);
    }
    static void metodo(int x){ //metodo de clase
        //metodo2(); //no puedo traer un metodo de instancia
    }

    void metodo2(){ //metodo de instancia
        metodo();
    }



}

/*
JVM:
 * stack: variables, y firmas de metodos
 * heap: OBJECTS
 */