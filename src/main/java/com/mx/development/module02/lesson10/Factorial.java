package com.mx.development.module02.lesson10;

public class Factorial {
    public static void main(String[] args) {
        long resultado = factorial(3);
        System.out.println("resultado: " + resultado);
    }
    private static long factorial(long numero){
        System.out.println("Recibi: " + numero);
        if(numero <= 1)
            return 1;
        else{
            System.out.println("numero:" + numero);
            return numero * factorial(numero -1);
        }
    }

}
