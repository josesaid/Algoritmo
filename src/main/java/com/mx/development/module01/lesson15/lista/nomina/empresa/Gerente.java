package com.mx.development.module01.lesson15.lista.nomina.empresa;

import lombok.Data;

import java.util.List;

@Data
public class Gerente extends LiderProyecto implements Budget {
    private List<LiderProyecto> lideresProyecto;
    @Override
    public void manageBudget() {
        System.out.println("El Gerente manejará las finanzas solo de este proyecto.");
    }

    public Gerente(List<LiderProyecto> lideresProyecto) {
        this.lideresProyecto = lideresProyecto;
    }

    public Gerente() {
    }

}
