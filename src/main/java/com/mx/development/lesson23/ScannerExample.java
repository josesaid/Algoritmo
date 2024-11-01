package com.mx.development.lesson23;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws IOException {
        //System.out.print("");
        //System.in.reset();
        //System.err.println();
        System.out.println("Dame el primer numero: ");
        //InputStream inputStream = System.in;
        //Scanner scanner = new Scanner(inputStream);
        Scanner scanner = new Scanner(System.in);
        int numero01 = scanner.nextInt();

        System.out.println("Dame el segundo numero: ");
        int numero02 = scanner.nextInt();

        System.out.println("el resultado de la suma es: " + (numero01+numero02));
        //String linea = scanner.nextLine();
        //System.out.println("Linea: " + linea);
    }

}
