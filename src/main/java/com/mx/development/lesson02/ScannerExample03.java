package com.mx.development.lesson02;

import java.util.Scanner;

public class ScannerExample03 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Escribe una linea: ");
        String linea  = console.nextLine();
        //String linea  = console.next();
        System.out.println(linea.toUpperCase());
    }
}
