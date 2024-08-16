package com.mx.development.lesson05;

public class ModuleWithContinueExample {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++){
            if(i % 2 == 0){ // ¿i modulo de 2 es igual a cero?
                System.out.println("el numero: " + i + " es par");
            } else{
                //System.out.println("el numero: " + i + " es IMpar");
                continue; //brinca la iteración actual.
            }
        }
    }

}
