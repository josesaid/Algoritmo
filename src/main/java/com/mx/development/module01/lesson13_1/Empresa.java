package com.mx.development.module01.lesson13_1;

public class Empresa {
    public static void main(String[] args) {
        LiderProyecto misael = new LiderProyecto("Misael", "misael.martinez@codegym.com",
                65_000.00f, softwareEngineers());

        LiderProyecto daleyma = new LiderProyecto("Daleyma", "daleyma.quispe@codegy.com",
                65_000.00f, analysts());

        LiderProyecto hugo = new LiderProyecto("Hugo", "hugo.osorio@codegy.com",
                65_000.00f, devops());

        Gerente laura = new Gerente(new LiderProyecto[]{ misael, daleyma, hugo });
        laura.setSalario(75_000.00f);

        Gerente andrea = new Gerente(new LiderProyecto[]{ misael, daleyma, hugo });
        andrea.setSalario(75_000.00f);

        Director ivan = new Director();
        ivan.setGerentes(new Gerente[]{ laura, andrea });
        ivan.setSalario(90_000.00f);

        for( Empleado e : misael.getIntegrantes() ){
            Tools.imprimeInformacionEmpleado(e);
        }
        /*
        for( Empleado e : daleyma.getIntegrantes() ){
            Tools.imprimeInformacionEmpleado(e);
        }
        for( Empleado e : hugo.getIntegrantes() ){
            Tools.imprimeInformacionEmpleado(e);
        }*/

    }

    private static Empleado[] devops() {
        return new Empleado[]{
                new Empleado()
        };
    }

    private static Empleado[] analysts() {
        return new Empleado[]{
                new Empleado(), new Empleado(), new Empleado()
        };
    }

    private static Empleado[] softwareEngineers() {
        Empleado osvaldo = new Empleado("1", "osvaldo@codegym.com", 40_000.00f);

        Empleado angel  = new Empleado("2", "angel.jean.pierre@codegym.com");
        angel.setSalario(34_000.00f);

        Empleado matias  = new Empleado("3", "matias.ajila@codegym.com", 30_000.00f);
        Empleado juan  =new Empleado("4", "juan.salcedo@codegym.com", 29_000.00f);
        Empleado hp  =new Empleado("5", "hp@codegym.com", 60_000.00f);
        Empleado albert  =new Empleado("6", "albert@codegym.com", 50_000.00f);

        Empleado[] integrantes = { angel, matias, juan, hp, albert, osvaldo};
        return integrantes;
    }

}
