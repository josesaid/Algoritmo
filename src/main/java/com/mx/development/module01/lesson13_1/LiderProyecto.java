package com.mx.development.module01.lesson13_1;

import lombok.Data;
@Data
public class LiderProyecto extends Empleado implements Pensable{

    private Empleado [] integrantes = new Empleado[6];

    public LiderProyecto(){
    }

    public LiderProyecto(String nombre, String email, float salario, Empleado[]integrantes){
        setNombre(nombre);
        setEmail(email);
        setSalario(salario);
        setIntegrantes(integrantes);
    }

    public LiderProyecto(Empleado[] integrantesEquipo){
        this.integrantes = integrantesEquipo;
    }

    @Override
    public void pensar() {
        System.out.println("Pensando como voy a hacer que mis integrantes programen mejor");
    }

}
