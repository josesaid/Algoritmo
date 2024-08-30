package com.mx.development.lesson11;

public class Instructor extends Persona{
    public void impartirAsesoria(){
        System.out.println("Imparte asesoria en Java");
    }

    public void hablar(){
        System.out.println("el instructor está hablando...");
    }


    @Override
    public void respirar() {
        System.out.println("Respirando como un instructor");
    }

    /*public void saludar(){
        System.out.println("Saludando como instructor 123");
    }*/
}
