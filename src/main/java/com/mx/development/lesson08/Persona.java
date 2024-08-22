package com.mx.development.lessons08;

public class Persona {
    private String nombre;
    private int edad;

    private String email;

    public void setEmail(String emailParametro){
        this.email = emailParametro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws Exception{
        if(edad<0)
            throw new Exception("La edad no puede ser negativa");
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return edad;
    }

}
