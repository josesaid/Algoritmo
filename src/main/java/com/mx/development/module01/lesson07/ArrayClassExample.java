package com.mx.development.module01.lesson07;

import java.util.Arrays;

public class ArrayClassExample {
    public static void main(String[] args) {
        int []numeros = { 8, 2, 15, 3, 24, 3, 100, 50, 44, 78, -1};
        imprimirArreglo(numeros);
        Arrays.sort(numeros);
        System.out.println("----------------------");
        imprimirArreglo(numeros);

        System.out.println("Numeros fraccionarios sin ordenar: ");
        float []numerosFraccionarios = new float[]{ 5.5f, 10.1f, 1.2f, 88.532f, -134.456f};
        imprimirArreglo(numerosFraccionarios);
        Arrays.sort(numerosFraccionarios);
        System.out.println("----------------------");
        System.out.println("Numeros fraccionarios YA ordenados: ");

        imprimirArreglo(numerosFraccionarios);
    }

    static void imprimirArreglo(int[]array){
        for (int i : array)
            System.out.print(i+", ");
        System.out.println();
    }

    static void imprimirArreglo(float[]array){
        for (float i : array)
            System.out.print(i+", ");
        System.out.println();
    }

}
