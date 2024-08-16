package com.mx.development.lesson07_5;

public class ValueOfMethodExample {
    public static void main(String[] args) {
        String resultado = String.valueOf(1+2+3+4);
        if(resultado instanceof String)
            System.out.println("la variable 'resultado' una cadena de texto");
        else
            System.out.println("la variable 'resultado' NO una cadena de texto");

        String palabra = args[0]; //"false"
        boolean expresionCondicional = Boolean.parseBoolean(palabra);
        if(expresionCondicional==true)
            System.out.println("El valor proporcionado es true");
        else
            System.out.println("El valor proporcionado es false");
    }
}
