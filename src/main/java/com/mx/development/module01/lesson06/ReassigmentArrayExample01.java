package com.mx.development.module01.lesson06;

public class ReassigmentArrayExample01 {
    public static void main(String[] args) {
        int x = 40;
        //int [] calificaciones = new int[3];
        //int [] calificaciones = {0 , 0, 0};
        int [] calificaciones = new int [] {0 , 0, 0};

        if(x < 5){
            calificaciones = new int[2];
            calificaciones[0] = 10;
            calificaciones[1] = 9;
        }else{
            calificaciones = new int[4];
            calificaciones[2] = 2;
            calificaciones[1] = 4;
            calificaciones[0] = 10;
            calificaciones[3] = 5;

        }
        System.out.println("Las calificaciones guardadas fueron: " + calificaciones.length);
        for(int i = 0; i< calificaciones.length; i = i+1){
            System.out.println(calificaciones[i]);
        }
    }

}
