package com.mx.development.module01.lesson07_5;

public class ForExample {
    public static void main(String[] args) {
    int numero = 20;

    for(int i=0; i<numero; i = i+1){
        if(i %2 ==0) {
            if (i == 10) {
                continue; //omite/brinca la iteración actual (i==10)
            }else {
                if(i >12)
                    break;
                else
                    System.out.print(i + " ");

            }
        }
    }
    System.out.println("Afuera del ciclo for...");
    }

}
