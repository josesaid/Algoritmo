package com.mx.development.module02.lesson13;

import java.util.Random;
import java.util.concurrent.Callable;

//0
public class CallableExample /*extends Object*/ implements Callable {

    public Object call() throws Exception {
        Random generator = new Random();
        Integer randomNumber = generator.nextInt(10);

        long time = randomNumber * 1000;
        System.out.println("segundos: " + (time/1000));
        Thread.sleep(time);

        return randomNumber;
    }

}

