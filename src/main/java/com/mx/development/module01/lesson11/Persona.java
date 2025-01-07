package com.mx.development.module01.lesson11;

//Pojo, Bean, JavaBean, Entity
public abstract class Persona extends Object implements SerHumano{
    private String nombre;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void saludar(){
        System.out.println("Saludando como persona 567");
    }
    public abstract void respirar();
}
