package com.mx.development.lesson07_5;

public class Review {
    public static void main(String[] args) {

        char letra = 'S';
        System.out.println(letra);

        //porque
        String x = "11" + 1;
        System.out.println(x);

        //int y = "11" - "1" ;
        String nombres="Juan Pablo", email="juan.pablo@email.com", genero = "Masculino";

        String nombre1 = "Juan";
        String nombre2 = "Pablo";
        String espacio = "          ";

        String nombreCompleto = nombre1 + espacio +nombre2;
        System.out.println(nombreCompleto);

        //String usoDeVariasComillas = "Hoy es un día 'Emocionante' por sino lo sabías...";
        String usoDeVariasComillas = "Hoy es un día \"Emocionante\" por sino lo sabías...";
        System.out.println(usoDeVariasComillas);
    }

}
