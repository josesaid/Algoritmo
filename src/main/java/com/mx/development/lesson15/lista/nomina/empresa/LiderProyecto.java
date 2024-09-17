package com.mx.development.lesson15.lista.nomina.empresa;

import lombok.Data;

import java.util.List;

@Data
public class LiderProyecto extends Empleado implements Pensable {

    private List<Empleado> integrantes; // = new Empleado[6];

    public LiderProyecto(){
    }

    public LiderProyecto(String nombre, String email, float salario, List<Empleado> integrantes){
        setNombre(nombre);
        setEmail(email);
        setSalario(salario);
        setIntegrantes(integrantes);
    }

    public LiderProyecto(List<Empleado> integrantesEquipo){
        this.integrantes = integrantesEquipo;
    }

    @Override
    public void pensar() {
        System.out.println("Pensando como voy a hacer que mis integrantes programen mejor");
    }

}
