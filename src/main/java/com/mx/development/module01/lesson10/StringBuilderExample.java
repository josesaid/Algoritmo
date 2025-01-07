package com.mx.development.module01.lesson10;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("El dia de hoy no podia crear una instancia del tipo de dato StringBuilder por distraido");

        sb.insert(13, "->").insert(13,", 26 de Agosto,");
        System.out.println(sb);


        sb.replace(2, 4, "XYZ").deleteCharAt(6);
        System.out.println(sb);

        sb.delete(0, 3);
        System.out.println(sb);

        int index = sb.indexOf("instancia");
        System.out.println("index : " + index );

        int index2 = sb.lastIndexOf("distraido");
        System.out.println("index2: " + index2 );

        char c = sb.charAt(35);
        System.out.println(c);

        //sb = new StringBuilder("abcdefghijkl");
        //System.out.println(sb.substring(2,3));

        System.out.println(sb);
        System.out.println("length: sb "  + sb.length());
        String resultado = sb./*reverse().reverse().*/toString().toUpperCase();
        System.out.println(resultado);

        //Design patterns:
        //1.- Creational - Builder Design pattern
        //2.- Behavioral
        //3.- Structural
        // https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
    }

}
