package com.mx.development.lesson02;

public class Memoria {
    /*static*/  static protected int x = 10;

    public static void main(String[] args) {
        System.out.println(x);
    }
}

class  MemoriaHija extends Memoria{

    //x esta siendo heredada desde la clase "Memoria"
    // por ello, si la puedo usar/alcanzar
    void metodo(){
        System.out.println(x);
    }
}