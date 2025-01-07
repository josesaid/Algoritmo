package com.mx.development.module01.lesson07;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        String[]nombres1 = new String[] {"Pedro", "Pablo", "Paco"};
        //String[]nombres2 = new String[] {"Juan", "John", "Jean"};
        String[]nombres2 = new String[] {"Pedro", "Pablo", "PACO"};

        //boolean resultado = Arrays.equals(nombres1, nombres2);
        boolean resultado = Arrays.equals(nombres1, nombres2);
        //if(resultado==true)
        //if(resultado != false)
        if(resultado)
            System.out.println("Los arreglos son identicos");
        else
            System.out.println("Los arreglos son diferentes");

    }

}
