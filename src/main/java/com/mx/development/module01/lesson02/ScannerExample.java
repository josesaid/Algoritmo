package com.mx.development.module01.lesson02;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        //InputStream inputStream = System.in;
        //Scanner scanner = new Scanner(inputStream);


        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Por favor escribe la edad: ");
        int edad = scanner2.nextInt();
        System.out.println("Edad capturada: " + edad);
    }
}
