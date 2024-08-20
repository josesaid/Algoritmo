package com.mx.development.lessons08;

public class ClaseConMetodoEstatico {
    static private String nombreInstructor;
    public static void setNombreInstructor(String _nombreInstructor) {
        nombreInstructor = _nombreInstructor;
    }

    void metodo1(){}
    public static String getNombreInstructor(){
        //return "Jose Said";
        return nombreInstructor;
    }
}
