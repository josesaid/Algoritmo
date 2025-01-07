package com.mx.development.module01.lesson03;

public class TernaryExample {
    public static void main(String[] args) {
        int x = 102;
        if(x == 10)
            System.out.println("x vale diez");
        else
            System.out.println("X vale otra cosa: " + x);

        //usando el operador ternario:
        System.out.println( (x==10) ? "x vale diez" : "X vale otra cosa: " + x );
    }

}
