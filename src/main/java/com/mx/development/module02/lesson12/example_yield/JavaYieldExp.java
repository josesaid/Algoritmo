package com.mx.development.module02.lesson12.example_yield;

public class JavaYieldExp extends Thread{
    public void run() {
        for (int i=0; i < 3 ; i++) {
            System.out.println(Thread.currentThread().getName() + " in CONTROL");
        }
    }
    public static void main(String[] args) {
        JavaYieldExp t1 = new JavaYieldExp();
        t1.setName("Anabel");

        JavaYieldExp t2 = new JavaYieldExp();
        t2.setName("Pedro");
        // this will call run() method

        t1.start();
        t2.start();

        for (int i=0; i<3; i++) {
            // The yield() method of thread class causes the currently executing thread object
            // to temporarily pause and allow other threads to execute.

            // Control passes to child thread
            System.out.println(Thread.currentThread().getName() + " tenia el control antes de cederlo");
            t1.yield();
            System.out.println(Thread.currentThread().getName() + " tiene el control");
            System.out.println("----------------------------------------");
        }

    }

}
