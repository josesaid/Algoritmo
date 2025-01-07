package com.mx.development.module01.lesson09;

public class EscapingCharsExample {
    public static void main(String[] args) {
        String cadena = "Hoy es \"Jueves\" 22 de Agosto de 2024.";
        System.out.println("cadena: " + cadena);

        //String cadena2 = "ABCDE\nFGHIJ\nKLMNÑO";
        String cadena2 = "ABCDE\tFGHIJ\tKLMNÑO";
        System.out.println(cadena2);

        String path = "C:\\\\Archivos de Programa\\";
        System.out.println(path);
    }

}
