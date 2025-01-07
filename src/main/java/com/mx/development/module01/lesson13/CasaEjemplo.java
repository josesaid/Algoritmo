package com.mx.development.module01.lesson13;

public class CasaEjemplo {

    int x = 20;

    static int variableEstatica = 100;
    public static void main(String[] args) {

        Casa casa1 = new Casa();

        casa1.setDireccion("Calle de las vacas flacas #123");
/*
        Casa casa2 = new Casa();
        casa2.setDireccion("Calle de las flores marchitas #567");

        CasaEjemplo instancia = new CasaEjemplo();
        instancia.metodo1();
*/
        metodoEstatico1();

        //int u = x + 1;
        CasaEjemplo instancia2 = new CasaEjemplo();
        instancia2.metodoEstatico1();

        //metodo1();
    }


    void metodo1(){
        int z = variableEstatica++;
        System.out.println("metodo1 llamando al metodo 2");
        metodo2();
    }

    void metodo2() {
        System.out.println("metodo 2 fue llamado x metodo 1");
        metodoEstatico1();
    }

    static void metodoEstatico1() {
        int local1 = variableEstatica++;
        System.out.println("Contenido del método estático");
    }
}
