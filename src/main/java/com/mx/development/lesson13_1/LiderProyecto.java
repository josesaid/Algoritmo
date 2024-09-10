package com.mx.development.lesson13_1;

public class LiderProyecto extends Empleado implements Pensable{

    private Empleado []integrantes = new Empleado[6];

    public LiderProyecto(){
    }

    public LiderProyecto(Empleado[] integrantesEquipo){
        this.integrantes = integrantesEquipo;
    }

    public Empleado[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Empleado[] integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public void pensar() {
        System.out.println("Pensando como voy a hacer que mis integrantes programen mejor");
    }

}
