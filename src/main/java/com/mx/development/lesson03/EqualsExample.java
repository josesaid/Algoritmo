package com.mx.development.lesson03;

public class EqualsExample {
    public static void main(String[] args) {
        String texto1 = new String("hOlA");
        String texto2 = new String ("HoLa");

        System.out.println(texto1 == texto2);
        System.out.println(texto1.toUpperCase().equals(texto2.toUpperCase()));

        System.out.println(texto1.equalsIgnoreCase(texto2));
    }
}
