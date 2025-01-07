package com.mx.development.module01.lesson20;

public class ExceptionExample01 {
    public static void main(String[] args) {
        String texto = null;

        try{
            System.out.println(texto.toUpperCase());
        }catch (Exception e){
            System.err.println("Cadena nula encontrada");
        }
        System.out.println("Adiós...");
    }

}
