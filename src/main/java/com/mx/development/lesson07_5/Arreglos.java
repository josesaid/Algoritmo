package com.mx.development.lesson07_5;

public class Arreglos {
    public static void main(String[] args) {
        int [] edades = { 45, 24, 29, 32, 18, 21, 36, 23, 26 };
        int suma = 0;
        for(int i=0; i<edades.length; i++){
            suma = suma + edades[i];
        }
        float edadPromedio = (float) suma / edades.length;
        System.out.println("La edad promedio del arreglo es: " + edadPromedio);
    }

}
