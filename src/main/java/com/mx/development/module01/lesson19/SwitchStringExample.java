package com.mx.development.module01.lesson19;

public class SwitchStringExample {
    public static void main(String[] args) {
        //String texto = "lunes";
        //String texto = "LUNES";
        //String texto = "Lunes";
        String texto = "lUnEs";
        switch (texto){
            case "lunes":
                System.out.println("lunes");
                break;
            case "LUNES":
                System.out.println("LUNES");
                break;
            default:
                System.out.println("default: " + texto);
                break;
        }

    }
}
