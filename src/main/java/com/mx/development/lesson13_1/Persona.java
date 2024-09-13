package com.mx.development.lesson13_1;


import lombok.Data;
@Data
//POJO, Bean, Java Bean, Entity
public class Persona extends Object implements Pensable{
    private String nombre;
    private String celular;
    @Override
    public void pensar() {
        System.out.println("Pensando como una persona normal...");
    }

    public Persona(String nombre, String celular) {
        this.nombre = nombre;
        this.celular = celular;
    }

    public Persona() {
    }
}
