package com.codegym.lessons.module02.lesson04;

public class ProfesionalSalto implements Brincable, Comible{
    @Override
    public void brincar() {
        System.out.println("El profesional de salto brinca 1 mt.");
    }

    @Override
    public void comer() {
        System.out.println("el profesional de salto está comiendo...");
    }
}
