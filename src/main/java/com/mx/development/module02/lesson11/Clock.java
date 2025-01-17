package com.mx.development.module02.lesson11;

public class Clock implements Runnable{
    public void run(){
        Thread currentThread = Thread.currentThread();
        while(!currentThread.isInterrupted()){
            try{
                Thread.sleep(1 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                currentThread.interrupt();
            }
            System.out.println("Algo!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();
        Thread.sleep(10 * 1000);
        clockThread.interrupt();
    }

}
