package com.codegym.lessons.module02.lesson04;

public class Niño implements Llorable, Brincable, Comible{
    @Override
     public void brincar() {
        System.out.println("El niño brinca 20 cm");
    }

    @Override
    public void comer() {
        System.out.println("el niño está comiendo...");
    }

    @Override
    public void llorar() {
        System.out.println("el niño llora mucho...");
    }
}
