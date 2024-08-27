package com.mx.development.lesson10;

public class StringFormatExample {
    public static void main(String[] args) {
        String texto  = "PI tiene un valor de " + Math.PI;
        System.out.println(texto);

        String texto2 = String.format("PI tiene un valor de %f, y epsilon vale: %f", Math.PI, Math.E);
        System.out.println(texto2);

        boolean respuesta = true;
        String banderita = String.format("diez multiplicado 2 veces es 20, cierto o falso?, Respuesta: %b", respuesta);
        System.out.println(banderita);

    }

}
