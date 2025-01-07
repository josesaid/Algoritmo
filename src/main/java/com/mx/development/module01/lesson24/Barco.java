package com.mx.development.module01.lesson24;

import lombok.Data;

@Data
public class Barco extends Vehiculo{
    private String capacidadPasajeros;
    private String color;
    public Barco(String color){
        super(color);
    }

    public void navegarEnElMar(){
        System.out.println("Navegando en el mar...");
    }

}
