package com.mx.development.module01.lesson17;

import lombok.Data;

@Data
public class Persona  {
    private String nombre;
    private String correoElectronico;
    private int edad;

    public Persona(String nombre, String correoElectronico) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
    }
    public Persona(String nombre, String correoElectronico, int edad) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.edad = edad;
    }

}
