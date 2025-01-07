package com.mx.development.module01.lesson19;

public class SwitchExample {
    public static void main(String[] args) {
        int  numero = 10;
        System.out.println("Antes del switch...");
        //byte, short, int, long, enum, char, String
        switch (numero){
            default:
                System.out.println("Otro numero: " + numero);
                break;
                case 1:
                System.out.println("Uno");
            case 2:
                System.out.println("dos");
                //break;

                //break;
                case 3:
                System.out.println("Tres");

        }
        System.out.println("Afuera del switch...");
    }
}
