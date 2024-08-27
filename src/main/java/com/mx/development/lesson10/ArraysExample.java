package com.mx.development.lesson10;

import java.util.Arrays;
import java.util.Collections;

public class ArraysExample {
    public static void main(String[] args) {
        String []nombres  = {"Santiago", "Andres", "Paola", "Alex", "Jose Manuel", "Nesthor", "Daniel",
                "Giovani", "Benjamin", "Freddy", "Franklin", "Smith", "Said"};

        String []estudiantes  = {"Santiago", "Andres", "Paola", "Alex", "Jose Manuel", "Nesthor", "Daniel",
                "Giovani", "Benjamin", "Freddy", "Franklin", "Smith"};

        String []instructores = {"Said"};

        String representacion = Arrays.toString(nombres);
        System.out.println(representacion);


        System.out.println(Arrays.equals(estudiantes, instructores));
        System.out.println(Arrays.equals(estudiantes, estudiantes));


        String []arrayVacio = new String[10];

        Arrays.fill(arrayVacio, "HOLA");
        System.out.println(Arrays.toString(arrayVacio));


        instructores = new String[]{"Said", "Pedro"};

        // CRUD = Create, Read, Update and Delete List
                //Java Collections Framework

        Arrays.sort(instructores);
        System.out.println(Arrays.toString(instructores));

    }


}
