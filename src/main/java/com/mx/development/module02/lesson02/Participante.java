package com.codegym.lessons.module02.lesson02;

public abstract class Participante extends Persona{
    //@Override
    abstract void comer(); /*{
        System.out.println("El participante está comiendo muy rico");
    }*/

    @Override
    void hablar() {
        System.out.println("EL participante está hablar correctamente");
    }

    /*void respirar(){
        System.out.println("Respirando como participante");
    }
     */


}
