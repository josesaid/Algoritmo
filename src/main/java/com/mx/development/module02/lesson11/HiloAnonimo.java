package com.mx.development.module02.lesson11;

public class HiloAnonimo {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                try {
                    Thread.sleep(4 * 1000);
                } catch (InterruptedException e) {
                    System.err.println("Error en sleep del hilo...");
                }
                System.out.println("Hilo...");
            }
        };
        t.start();
    }
}
