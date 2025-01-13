package com.codegym.lessons.module02.lesson02;

import lombok.Data;

@Data
public abstract class Persona {
    public Persona(){}
    private String nombre;
    private String genero;

    abstract void comer();
    abstract void hablar();

    void respirar(){}
}
