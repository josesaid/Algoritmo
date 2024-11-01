package com.mx.development.lesson24;

import lombok.Data;

@Data public class Vehiculo {
    private String nombre;
    private String color;
    public Vehiculo(){}
    public Vehiculo(String color){
        this.color = color;
    }

}
