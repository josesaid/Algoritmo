package com.mx.development.module01.lesson07_5;

public class OperadorTernario {
    public static void main(String[] args) {
        int dia = 16;
/*
        if(dia < 15)
            System.out.println("Nos encontramos en la primera mitad del mes");
        else
            if(dia ==15)
                System.out.println("Dia es 15");
            else
                if(dia > 15)
                    System.out.println("Nos encontramos en la segunda mitad del mes");
*/
        System.out.println  (dia < 15  ? "Nos encontramos en la primera mitad del mes"
                            :
                            (dia ==15 )? "Dia es 15" : "Nos encontramos en la segunda mitad del mes");

    }

}
