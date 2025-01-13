package com.codegym.lessons.module02.lesson04;

public class Adulto implements Brincable, Comible{
    @Override
    public void brincar() {
        System.out.println("Adulto brinca 50 cms.");
    }

    @Override
    public void comer() {
        System.out.println("el adulto está comiendo...");
    }

}
