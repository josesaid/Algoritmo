package com.codegym.lessons.module02.lesson02;

public class Television {
    protected void encender(){
        System.out.println("1.- TV encender");
    }
    private void encender(ControlRemoto controlRemoto){
        controlRemoto.encender();
        //System.out.println("TV encender");
    }

    public boolean encender(ControlRemoto controlRemoto, String marcaPilas){
        System.out.println("Encender tv con control y necesitamos pilas");
        int porcentaje = controlRemoto.encender(controlRemoto, marcaPilas);
        if(porcentaje == 100)
            return true;
        else
            return false;
    }
    void apagar(){
        System.out.println("Apagar");
    }
}
