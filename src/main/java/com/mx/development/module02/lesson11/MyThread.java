package com.mx.development.module02.lesson11;

public class MyThread implements Runnable{
    public void run(){
        //System.out.println(Thread.currentThread().getName());
        for(int i=0;i<99;i++){
            System.out.println(Thread.currentThread().getName()+"<<<<<<__"+i);
        }
    }

}
