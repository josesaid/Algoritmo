package com.mx.development.lesson07;

public class ArraysExample01 {
    public static void main(String[] args) {
        int n = 5;
        int [] arreglo = new int [n];
        arreglo[0] = n;
        arreglo[1] = n*2;
        arreglo[2] = n*3;
        arreglo[3] = n*4;
        arreglo[4] = n*5;

        for(int i = 0; i<arreglo.length ; i++ ){
            System.out.println(arreglo[i]);
        }
    }

}
