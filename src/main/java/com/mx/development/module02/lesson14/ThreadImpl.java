package com.mx.development.module02.lesson14;

import java.util.concurrent.TimeUnit;

public class ThreadImpl implements Runnable {
    public void run() {
        try {
            Long num = (long) (Math.random() / 30);
            //Thread.currentThread().setName("miHilillo-01");
            System.out.println("Thread Name: " +Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(num);
            System.out.println("after sleep Thread Name: " +Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

