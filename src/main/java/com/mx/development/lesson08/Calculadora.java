package com.mx.development.lessons08;

public class Calculadora {
    public static void main(String[] args) {
        float resultadoSuma = sumar(3.1415f, 20.5f);
        System.out.println("el resultado de la suma: " + resultadoSuma );

        byte cinco = 5;
        byte dos = 2;
        byte resultadoResta = restar(cinco,dos);
        System.out.println("El resultado de la resta: " + resultadoResta);
    }

    private static float sumar(float x, float y){
        float resultado = x + y;
        return resultado;
    }

    private static byte restar(byte x, byte y){
        byte resultado =(byte) (x - y);
        return resultado;
    }

}
