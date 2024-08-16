package com.mx.development.lesson06;

public class SumExample {

    public static void main(String[] args) {
        int []numeros = { -10,   11, 23, 25, 13, 22, 3, 8, 2, 18, 1, 40 ,200, 300};
        int suma = 0;
        for( int i=0; i < numeros.length; i++ ){
            suma  = suma + numeros[i];
        }
        System.out.println("La suma fue: " + suma);
        int []array = new int[suma];
        System.out.println("el tamaño de mi arreglo es: " + array.length);
    }
}
