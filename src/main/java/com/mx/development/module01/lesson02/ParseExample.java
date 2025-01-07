package com.mx.development.module01.lesson02;

public class ParseExample {
    public static void main(String[] args) {
        String numero = "45";
        int x = Integer.parseInt(numero); //int x = 45;
        System.out.println( 45+1 + "fabrizio");
        System.out.println("x: " + (x+1));

        //float pi = Float.parseFloat("3.141asa529");
        float pi = Float.parseFloat("3.141529");
        System.out.println("pi: " + pi);

        double peso = Double.parseDouble("67.300");
        System.out.println(peso+" gramos.");
    }
}
