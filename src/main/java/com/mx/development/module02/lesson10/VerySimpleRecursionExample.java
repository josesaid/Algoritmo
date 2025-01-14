package com.mx.development.module02.lesson10;

public class VerySimpleRecursionExample {
    public static void main(String[] args) {
        callMyself(4);
    }
    public static void callMyself(long i) {
        int copia=(int)i;
        if (i < 0) {
            return;
        }
        System.out.print(" " + i);
        i = i - 1;
        callMyself(i);
        System.out.println("Copia: " + copia);
    }

}
