package com.codegym.lessons.module02.lesson04;

public class Adolescente implements ComportamientoAdolescente{
    @Override
    public void brincar() {
        System.out.println("El adolescente brinca mucho");
    }

    @Override
    public void comer() {
        System.out.println("La adolescente come mesuradamente algunas ocasiones");
    }

    @Override
    public void llorar() {
        System.out.println("La adolescente llora esporádicamente");
    }
}
