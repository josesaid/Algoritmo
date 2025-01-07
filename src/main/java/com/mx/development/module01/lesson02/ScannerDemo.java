package com.mx.development.module01.lesson02;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        String s = "Hello World! 3 + 3.0 = 6";

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(s);

        while (scanner.hasNext()) {

            // check if the scanner's next token is an Int
            System.out.print("" + scanner.hasNextInt());

            // print what is scanned
            System.out.println("<" + scanner.next()+">");
        }

        // close the scanner
        scanner.close();
    }
}
