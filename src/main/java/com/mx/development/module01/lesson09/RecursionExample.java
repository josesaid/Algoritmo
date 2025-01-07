package com.mx.development.module01.lesson09;

public class RecursionExample {
    public static void main(String[] args) {
        int result = sum(4);
        System.out.println(result);
    }
    public static int sum(int k) {
        //+4,+3, +2, +1
        System.out.println("K: " + k);
        if (k > 0) {
            return k + sum(k - 1); //1avez=4+sum(3+sum(2+sum(1))))
        } else {
            return 0;
        }
        //Aqui ya no hay mas código, cosa que si tenemos en el otro ejercicio de Albert.

    }
}
