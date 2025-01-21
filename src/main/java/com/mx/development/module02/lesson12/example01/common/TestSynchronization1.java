package com.mx.development.module02.lesson12.example01.common;


//import com.mx.development.module02.lesson12.example01.notsync.Table;

import com.mx.development.module02.lesson12.example01.sync.Table;

public class TestSynchronization1 {
    public static void main(String[] args) {
        Table obj = new Table();//only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        MyThread3 t3 = new MyThread3(obj);

        t3.setPriority(1); //1000
        t2.setPriority(5); //100
        t1.setPriority(10); //5

        t1.start();
        t2.start();
        t3.start();
    }

}
