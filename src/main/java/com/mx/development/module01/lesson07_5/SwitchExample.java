package com.mx.development.module01.lesson07_5;

public class SwitchExample {
    public static void main(String[] args) {
        int numero = 25;
        switch (numero){   //char, byte, short, int, enum, String
            case 12:
                System.out.println("numero: " + numero);
                break;
            case 15:
                System.out.println("Mitad de mes (15) : " + numero);
                break;
            case 30:
                System.out.println("Fin de mes >25) : " + numero);
                break;
            default:
                System.out.println("Otro número: " + numero);
                break;
        }
    }
}
