package com.mx.development.lesson09;

public class StringMethods2Example {
    public static void main(String[] args) {
        String texto1 = "El gato de mi vecina, se cayó y se fracturó la cola";
        String texto2 = "El gato de mi vecina, se cayó y se fracturó la cola";

        int resultado = texto1.compareTo(texto2);
        System.out.println("¿Ambas cadenas son iguales? " + resultado);
        //-1  0   1

        System.out.println(texto1.startsWith("El gato"));
        System.out.println(texto2.startsWith("Superman algo"));
        System.out.println(texto1.endsWith("la cola"));

        int indice = texto1.indexOf("cayó");
        System.out.println("indice: "+ indice);

        int indiceNoExistente = texto2.indexOf("batman");
        System.out.println(indiceNoExistente);

        System.out.println(texto1.substring(4));
        System.out.println(texto1.substring(4, 29));

        System.out.println(texto1.replace('a', 'X'));

        String texto3 = "        algun texto en particular        333 ";
        System.out.println(texto3.length());
        texto3 = texto3.trim();


        //SOLID principles
        //String es inmutable, mientras que StringBuilder & StringBuffer son mutables.
        int longitud = texto3.length();
        texto3 = texto3.toUpperCase();
        System.out.println(texto3);

        //System.out.println(texto3.length());
    }

}
