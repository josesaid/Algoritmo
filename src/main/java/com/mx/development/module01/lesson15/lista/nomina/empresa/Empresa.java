package com.mx.development.module01.lesson15.lista.nomina.empresa;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Empresa {
    public static void main(String[] args) {
        LiderProyecto misael = new LiderProyecto("Misael", "misael.martinez@codegym.com",
                65_000.00f, softwareEngineers());

        LiderProyecto daleyma = new LiderProyecto("Daleyma", "daleyma.quispe@codegy.com",
                65_000.00f, analysts());

        LiderProyecto hugo = new LiderProyecto("Hugo", "hugo.osorio@codegy.com",
                65_000.00f, devops());

        Gerente laura = new Gerente(Arrays.asList(misael, daleyma, hugo));
        laura.setSalario(75_000.00f);

        LiderProyecto yolanda = new LiderProyecto("Yolanda", "yolanda@codegym.com", 66_000.00f, softwareEngineersII());
        LiderProyecto hp = new LiderProyecto("HP", "hp@codegym.com", 66_000.00f, softwareEngineersIII());
        LiderProyecto matias = new LiderProyecto("HP", "hp@codegym.com", 66_000.00f, softwareEngineersIV());

        Gerente andrea = new Gerente(Arrays.asList(yolanda, hp, matias));
        andrea.setSalario(75_000.00f);

        Director ivan = new Director();
        ivan.setGerentes(Arrays.asList(laura, andrea));
        ivan.setSalario(90_000.00f);

        System.out.println("Gente que le reporta a Misael");
        for( Empleado e : misael.getIntegrantes() ){
            Tools.imprimeInformacionEmpleado(e);
        }
        System.out.println("---------------------------");

        System.out.println("Gente que le reporta a Daleyma");
        for( Empleado e : daleyma.getIntegrantes() ){
            Tools.imprimeInformacionEmpleado(e);
        }
        System.out.println("---------------------------");

        System.out.println("Gente que le reporta a Hugo");
        for( Empleado e : hugo.getIntegrantes() ){
            Tools.imprimeInformacionEmpleado(e);
        }
        System.out.println("---------------------------");

        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        float nominaSinImpuestos = Tools.calculaNomina(ivan);
        System.out.println("ANTES DE IMPUESTOS: " + formatter.format(nominaSinImpuestos));

        float dinero = nominaSinImpuestos * 1.16f;
        System.out.println("DESPUES DE IMPUESTOS: " + formatter.format(dinero));
    }

    private static List<Empleado> devops() {
        List<Empleado> analistasLista = new ArrayList<>();
        analistasLista.add(new Empleado("Empleado 4", "empleado1@codegym.com", 55_000.00f));
        analistasLista.add(new Empleado("Empleado 5", "empleado2@codegym.com", 56_000.00f));
        analistasLista.add(new Empleado("Empleado 6", "empleado3@codegym.com", 57_000.00f));
        return analistasLista;
    }

    private static List<Empleado> analysts() {
        List<Empleado> analistasLista = new ArrayList<>();
        analistasLista.add(new Empleado("Empleado 1", "empleado1@codegym.com", 45_000.00f));
        analistasLista.add(new Empleado("Empleado 2", "empleado2@codegym.com", 46_000.00f));
        analistasLista.add(new Empleado("Empleado 3", "empleado3@codegym.com", 47_000.00f));
        return analistasLista;
    }

    private static List<Empleado> softwareEngineers() {
        Empleado osvaldo = new Empleado("1", "osvaldo@codegym.com", 40_000.00f);

        Empleado angel  = new Empleado("2", "angel.jean.pierre@codegym.com");
        angel.setSalario(34_000.00f);

        Empleado matias  = new Empleado("3", "matias.ajila@codegym.com", 30_000.00f);
        Empleado juan  =new Empleado("4", "juan.salcedo@codegym.com", 29_000.00f);
        Empleado hp  =new Empleado("5", "hp@codegym.com", 60_000.00f);
        Empleado albert  =new Empleado("6", "albert@codegym.com", 50_000.00f);

        Empleado[] integrantes = { angel, matias, juan, hp, albert, osvaldo};
        return Arrays.asList(integrantes);
    }

    private static List<Empleado> softwareEngineersII() {
        Empleado siete = new Empleado("7", "siete@codegym.com", 47_000.00f);

        Empleado ocho  = new Empleado("8", "ocho@codegym.com");
        ocho.setSalario(48_000.00f);

        Empleado nueve  = new Empleado("9", "nueve@codegym.com", 49_000.00f);
        Empleado diez   =new Empleado("10", "diez@codegym.com", 50_000.00f);


        Empleado[] integrantes = { siete, ocho, nueve, diez };
        return Arrays.asList(integrantes);
    }

    private static List<Empleado> softwareEngineersIII() {
        Empleado once = new Empleado("11", "once@codegym.com", 47_000.00f);

        Empleado doce  = new Empleado("12", "doce@codegym.com");
        doce.setSalario(48_000.00f);

        Empleado trece  = new Empleado("13", "trece@codegym.com", 49_000.00f);
        Empleado catorce   =new Empleado("14", "catorce@codegym.com", 50_000.00f);


        Empleado[] integrantes = { once, doce, trece, catorce};
        return Arrays.asList(integrantes);
    }
    private static List<Empleado> softwareEngineersIV() {
        Empleado quince = new Empleado("15", "quince@codegym.com", 47_000.00f);

        Empleado diesciseis  = new Empleado("16", "diesciseis@codegym.com");
        diesciseis.setSalario(48_000.00f);

        Empleado[] integrantes = { quince, diesciseis};
        return Arrays.asList(integrantes);
    }

}
