package com.codegym.lessons.module02.lesson01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Animal {
    private String color;
    private String nombre;
    private String peso;

    public Animal(){}
    public Animal(String color, String nombre, String peso) {
        this.color = color;
        this.nombre = nombre;
        this.peso = peso;
    }

    void comer(){
        System.out.println("Animal - Método Comer ");
    }

}
