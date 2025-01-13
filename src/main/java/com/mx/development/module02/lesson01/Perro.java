package com.codegym.lessons.module02.lesson01;

import lombok.Data;

@Data
public class Perro extends Animal implements ILadrar, ICantar{
    private String raza;
    public Perro(String color, String nombre, String peso, String raza){
        super(color, nombre, peso);
        setRaza(raza);
    }

    public void comer(){
        System.out.println("Perro - Método Comer ");
    }


    @Override
    public void ladrar() {
        System.out.println("Guau guau");
    }

    @Override
    public void cantar() {
        System.out.println("Suponiendo que el perro cante... LA la lala");
    }

    public String toString(){
        return super.toString().toUpperCase() + "RAZA: " + getRaza().toUpperCase();
    }

}
