package com.mx.development.lesson23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamsExample {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Dame el primer numero: ");
        String linea01 = bufferedReader.readLine();
        int numero01 = Integer.parseInt(linea01);

        System.out.println("Dame el segundo numero: ");
        String linea02 = bufferedReader.readLine();
        int numero02 = Integer.parseInt(linea02);

        System.out.println("EL resultado de la suma es: " + (numero01+numero02));

    }
}
