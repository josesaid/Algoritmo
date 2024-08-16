package com.mx.development.lesson07_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInExample {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Escribe una cadena de texto: ");
        String cadena = br.readLine();

        System.out.println("Lo que el usuario escribió fue: ");
        System.out.println(cadena.toUpperCase());
    }
}
