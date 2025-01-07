package com.mx.development.module01.lesson20;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {

        try {
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.err.println("Imposibole dividir entre cero");
        }
    }
}
