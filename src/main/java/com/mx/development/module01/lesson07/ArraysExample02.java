package com.mx.development.module01.lesson07;

public class ArraysExample02 {
    public static void main(String[] args) {
        int n = 5;
        int [] arreglo = new int [n];

        for(int i = 0; i<arreglo.length ; i++ /*, n = n+5*/ ){ // n+=5
            //System.out.println("N: " + n);
            System.out.println("Asignando el número n: " + n + " al arreglo en la posición["+i+"]");
            arreglo[i] = n;
            n = n+5;
        }
        System.out.println("-->");

        for(int numero : arreglo){ //enhanced (improved) for
            System.out.println(numero);
        }
        System.out.println("Adiós...");

    }

}
