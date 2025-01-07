package com.mx.development.module01.lesson02;

import java.util.Scanner;

public class ScannerExample04 {
    public static void main(String[] args) {
        String str = "10 20 40 60";
        Scanner scanner = new Scanner(str);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a+b);

        if(scanner.hasNextInt()) {
            int c = scanner.nextInt();
            System.out.println(c);
        }

    }
}
