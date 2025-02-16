package com.mx.development.module01.lesson15.lista.nomina.empresa;


import lombok.Data;
@Data
//POJO, Bean, Java Bean, Entity
public class Persona extends Object implements Pensable {
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
