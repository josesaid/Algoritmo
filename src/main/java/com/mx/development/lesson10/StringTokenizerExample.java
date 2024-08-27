package com.mx.development.lesson10;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String texto = "Java programming language, being platform-independent, " +
                "has built-in support for Unicode characters, allowing developers " +
                "to create applications that can work seamlessly with diverse languages" +
                " and scripts. Before Unicode, there were multiple standards to represent " +
                " character encoding";

        String delimitadores = "., ";

        StringTokenizer stringTokenizer = new StringTokenizer(texto, delimitadores);

        int contadorPalabras= 0;

        while(stringTokenizer.hasMoreElements()){
            String palabra = stringTokenizer.nextToken();
            contadorPalabras++;
            System.out.println(palabra.toUpperCase() );
        }

        System.out.println("contadorPalabras: " + contadorPalabras);
    }

}
