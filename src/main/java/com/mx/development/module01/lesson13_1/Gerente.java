package com.mx.development.module01.lesson13_1;

import lombok.Data;
@Data
public class Gerente extends LiderProyecto implements Budget{
    private LiderProyecto[] lideresProyecto;
    @Override
    public void manageBudget() {
        System.out.println("El Gerente manejará las finanzas solo de este proyecto.");
    }

    public Gerente(LiderProyecto[] lideresProyecto) {
        this.lideresProyecto = lideresProyecto;
    }

    public Gerente() {
    }

}
