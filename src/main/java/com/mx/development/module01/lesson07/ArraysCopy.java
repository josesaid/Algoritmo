package com.mx.development.module01.lesson07;

public class ArraysCopy {
    public static void main(String[] args) {
        String[]nombres1 = new String[] {"Pedro", "Pablo", "Paco"};
        String[]nombres2 = new String[] {"Juan", "John", "Jean"};

        String [] estudiantes = new String[6];

        for (int i=0;i<nombres1.length; i++){
            estudiantes[i] = nombres1[i];
        }

        for (int i=0; i<nombres2.length; i++){
            estudiantes[i+3] = nombres2[i];
        }


        for (String estudiante : estudiantes)
            System.out.print(estudiante+", ");
    }

}
