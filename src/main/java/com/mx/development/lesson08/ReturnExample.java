package com.mx.development.lessons08;

public class ReturnExample {
    public static void main(String[] args) {

        String resultado = concatenarAlgo("hola soy pepito y no haré travesuras", "YO NO SOY PEPITO, SINO JUANITO");
        System.out.println(resultado);
    }

    private static String concatenarAlgo(String cadena1, String cadena2) {
        //return cadena1.toUpperCase() + " " + cadena2.toLowerCase();
        return new String(cadena1.toUpperCase() + " " + cadena2.toLowerCase());
    }

}
