package com.mx.development.lesson13_1;

public class Empresa {
    public static void main(String[] args) {
        Empleado osvaldo = new Empleado();
        osvaldo.setNombre("Osvaldo");
        osvaldo.setEmail("osvaldo@codegym.com");

        LiderProyecto misael = new LiderProyecto();
        misael.setNombre("Misael");
        misael.setEmail("misael.martinez@codegym.com");
        Empleado angel  = new Empleado("2", "angel.jean.pierre@codegym.com");
        Empleado matias  = new Empleado("3", "matias.ajila@codegym.com");
        Empleado juan  =new Empleado("4", "juan.salcedo@codegym.com");
        Empleado hp  =new Empleado("5", "hp@codegym.com");
        Empleado albert  =new Empleado("6", "albert@codegym.com");
        Empleado[]integrantes = { angel, matias, juan, hp, albert, osvaldo};
        misael.setIntegrantes(integrantes);
    }

}
