package com.mx.development.module02.lesson11;

public class MyThreadExample {
    public static void main(String[] args) {
        //System.out.println(Thread.currentThread().getName());
        //System.out.println("Ejecutando el hilo main");

        MyThread myThread = new MyThread();
        Thread hilo01 = new Thread(myThread);
        hilo01.start(); // usando hilos
        //hilo.run(); // no usando hilos

        Thread hilo02 = new Thread(myThread);
        hilo02.start(); // usando hilos

        /*
        //----------------------
        // Otra manera de crear hilos
        Thread hilo03 = new Thread();
        hilo03.start();
         */

        // Otra manera alternativa de crear hilos:
        /*MyThreadcito miHilito = new MyThreadcito();
        miHilito.start();

        Thread miHilito02 = new MyThreadcito();
        miHilito02.start();*/
    }

}
