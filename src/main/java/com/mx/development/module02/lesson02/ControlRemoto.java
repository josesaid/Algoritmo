package com.codegym.lessons.module02.lesson02;

public class ControlRemoto {
    public void encender() {
        System.out.println("2.- Encendiendo una tv con el control remoto");
    }

    public int encender(ControlRemoto controlRemoto, String marcaPilas) {
        System.out.println("2.2- Encendiendo una tv con el control remoto y cambiamos" +
                            " las pilas, ahora usaremos: " + marcaPilas);
        return controlRemoto.cambiarPilas();
    }

    private int cambiarPilas() {
        System.out.println("cambiar pilas...");
        return 1001;
    }
}
