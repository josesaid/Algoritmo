package com.mx.development.module01.lesson03;

public class NotNotExample {
    //por defecto el valor de la siguiente variable llamada esJulio, será false.
    static boolean esJulio;
    public static void main(String[] args) {
        //boolean esJulio = true;

        //if(!!!esJulio)
        if(!esJulio ==false)
            System.out.println(esJulio);
        else
            System.out.println(String.valueOf(esJulio).toUpperCase());
    }

}
