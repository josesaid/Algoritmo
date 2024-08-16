package com.mx.development.lesson07_5;

public class Persona {
    private String nombre;

    void reir(String risa){
        System.out.println(risa);
    }

    public static void main(String[] args) {
        Persona angel = new Persona();
        angel.nombre = "Ángel";
        System.out.println(angel.nombre);
        angel.reir("jajaja");

        System.out.println("------");

        Persona karol = new Persona();
        karol.nombre = "Karol";
        System.out.println(karol.nombre);
        karol.reir("jejeje");

    }

}
