package com.mx.development.lesson03;

public class ComparationExample {
    public static void main(String[] args) {
        int x = 30;
        int y = 10;

        if(x != y){
            int x2 = 20;
            System.out.println("x es diferente de y");
        }
        if(x > y){
            int x2 = 40;
            System.out.println("X es mayor que Y ("+y+")");
        }else if(x < y){
            System.out.println("X  es menor que Y ("+y+")");
        }else if(x == y){
            System.out.println("Ambos números son idénticos");
        }
        System.out.println("ciao");
    }

}
