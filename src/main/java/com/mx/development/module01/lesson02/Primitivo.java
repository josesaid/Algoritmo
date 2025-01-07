package com.mx.development.module01.lesson02;

public class Primitivo {
    public static void main(String[] args) {
        double d = 123.56;
        String cadena = String.valueOf(d);
        System.out.println(cadena.length());
        //boolean hoyMeBane = true;
        boolean hoyMeBane = false;
        String tomeDucha = String.valueOf(hoyMeBane);
        System.out.println("tomeDucha: " + tomeDucha);
    }
}
