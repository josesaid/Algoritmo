package com.mx.development.lessons08;

import com.mx.development.module01.lesson02.Memoria;

public class PublicAccessModifierExample {
    public static void main(String[] args) {
        Memoria memoria = new Memoria();
        // Memoria.x no es accesible desde otra clase,
        // ya que "x" es protected
        //memoria.x = 10;
        //System.out.println("numero: " + memoria.x);
    }
}
