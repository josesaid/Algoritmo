package com.mx.development.module01.lesson10;

public class StringExample01 {
    public static void main(String[] args) {
        //String texto = "Hoy es jueves 28 de marzo del 2024.";
        //texto = texto.toUpperCase();
        //System.out.println( texto );
        StringBuilder sb = new StringBuilder();
        sb.append("Hoy es Lunes 26 de Agosto del 2024.");
        sb.append(" Y son las 8.03pm CST.");
        sb.reverse().reverse().insert(10, "BOTELLA DE AGUA");
        System.out.println(sb);


        String substring = sb.substring(15);
        //System.out.println(sb.toString());
        System.out.println(substring);

        sb = sb.delete(1,60);
        System.out.println(sb);

        int index = sb.indexOf("CST");
        System.out.println(index);

        sb.setCharAt(0, 'X');
        sb.setCharAt(2, 'F');
        sb.insert(0, "Hola: ");
        System.out.println(sb);


    }



}
