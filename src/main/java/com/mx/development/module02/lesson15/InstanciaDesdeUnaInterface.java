package com.mx.development.module02.lesson15;

public class InstanciaDesdeUnaInterface {
    public static void main(String[] args) {
        Programable instancia1 = new Programable(){
            @Override
            public void programar(Object object) {
                System.out.println("A" + object.toString() );
            }

        };
        instancia1.programar(new Object());

        Programable instancia2 = new Programable(){
            @Override
            public void programar(Object object) {
                System.out.println("B" + object.hashCode() );
            }

        };
        instancia2.programar(new Object());

        Programable instancia3 = new ProgramableImpl();
        instancia3.programar(new Object());

        //Programable instancia4 = new ProgramableImpl2();
        //instancia4.programar(new Object());
    }

}
