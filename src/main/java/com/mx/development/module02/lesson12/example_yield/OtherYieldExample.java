package com.mx.development.module02.lesson12.example_yield;

/*
* A yield() method is a static method of Thread class and it can stop
* the currently executing thread and will give a chance to other waiting
* threads of the same priority. If in case there are no waiting threads
* or if all the waiting threads have low priority then the same thread will
*  continue its execution.

The advantage of yield() method is to get a chance to execute other waiting
* threads so if our current thread takes more time to execute and allocate
* processor to other threads.*/

public class OtherYieldExample extends Thread{
    public void run() {
        for (int i = 0; i < 10; ++i) {
            Thread.yield(); // By calling this method, MyThread stop its execution and giving a chance to a main thread
            System.out.println("run Thread started:" + Thread.currentThread().getName());
        }
        System.out.println("run Thread ended:" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        OtherYieldExample thread = new OtherYieldExample();
        thread.start();
        /*for (int i = 0; i < 5; ++i) {
            System.out.println("Thread started:" + Thread.currentThread().getName());
        }*/
        System.out.println("Thread ended:" + Thread.currentThread().getName());
    }
}
