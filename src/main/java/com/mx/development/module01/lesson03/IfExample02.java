package com.mx.development.module01.lesson03;

public class IfExample02 {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 3;
        if (a == 1) {
            System.out.println("A == 1"); //*
        } else if (a >= b) {
            System.out.println("A >= B");  //*
        } else if (b == a) {
            System.out.println("B == A");
        } else {
            System.out.println(" B != A");
        }
        System.out.println("Ciao");
    }
}
