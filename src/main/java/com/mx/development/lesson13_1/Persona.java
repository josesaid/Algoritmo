package com.mx.development.lesson13_1;

//POJO, Bean, Java Bean, Entity
public class Persona implements Pensable{
    private String nombre;
    private String celular;

    public void setNombre(String nombrep){
        this.nombre = nombrep;
    }

    public String getNombre(){
        return nombre;
    }

    public void setCelular(String celularp){
        this.celular = celularp;
    }
    public String getCelular(){
        return celular;
    }

    @Override
    public void pensar() {
        System.out.println("Pensando como una persona normal...");
    }

}
