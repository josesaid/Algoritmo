package com.mx.development.lesson07;

public class SumArrayExample {
    public static void main(String[] args) {
        int []numeros = {10, 20, 30, 40,  50};
        int suma = 0;
        for(int i : numeros){
            suma += i;
        }
        System.out.println("LA sumatoria de valores fue: " + suma);
    }

}
