package com.mx.development.lesson06;

public class ZeroSizeArray {
    public static void main(String[] args) {
        int []emptyArray; // = new int[0];

        int size = remoteFunction();
        emptyArray = new int[size];
        System.out.println("el tamaño de mi arreglo es: " + emptyArray.length);



        size = remoteFunction2();
        emptyArray = new int[size];
        System.out.println("el tamaño de mi arreglo es: " + emptyArray.length);

    }

    private static int remoteFunction() {
        return 2000;
    }
    private static int remoteFunction2() {
        return 300;
    }
}
