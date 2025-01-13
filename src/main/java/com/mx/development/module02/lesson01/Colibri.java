package com.codegym.lessons.module02.lesson01;

import lombok.Data;

@Data
public class Colibri extends Animal implements ICantar{
    private String plumaje;
    public Colibri(String color, String nombre, String peso, String plumaje){
        super(color, nombre, peso);
        setPlumaje(plumaje);
    }

    public void comer(){
        System.out.println("Colibri - Método Comer ");
    }


    @Override
    public void cantar() {
        System.out.println("fiu fiu");
    }
}
