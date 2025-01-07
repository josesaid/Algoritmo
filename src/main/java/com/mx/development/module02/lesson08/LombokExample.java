package com.mx.development.module02.lesson08;

import lombok.Data;

@Data
public class LombokExample {
    private int edad=18;
    private boolean esMayorDeEdad;
    private String email;

    public static void main(String[] args) {
        LombokExample instancia = new LombokExample();
        instancia.setEdad(21);
        instancia.setEsMayorDeEdad(instancia.getEdad()>=18);
        instancia.setEmail("algo@dominio.com");

        System.out.println(instancia);
    }
}
