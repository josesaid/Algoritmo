package com.mx.development.module02.lesson02;

public class FabricaAutosUSA extends FabricaAutos{
    public Auto fabricarAuto(String nombre){
        return new AutoChevrolet();
    }

}
