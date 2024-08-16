package com.mx.development.lesson07_5;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe numero1: ");
        int numero1 = scanner.nextInt();

        System.out.println("Escribe numero2: ");
        int numero2 = scanner.nextInt();

        System.out.println("Escribe una operacion (suma, resta): ");
        String operacion = scanner.next();

        if(operacion.equals("suma"))
            System.out.println("resultado: " + (numero1+numero2) );
        else
        if(operacion.equals("resta"))
            System.out.println("resultado: " + (numero1-numero2) );
        else
            System.out.println("La operación no se puede llevar a cabo: " + operacion );

    }

}
