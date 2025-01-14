package com.mx.development.module02.lesson10;

public class SumatoriaNumerosRecursion {
    public static void main(String[] args) {
        long resultado = suma(20);
        System.out.printf("Resultado: " + resultado); //210
    }

    //numero = (numero * numero +1 ) /2
     //numero = (20 * 21)

    private static long suma(long numero){
        if(numero <=1)
            return numero;
        return numero + suma(numero - 1);
    }

}
