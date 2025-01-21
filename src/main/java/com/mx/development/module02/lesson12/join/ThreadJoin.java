package com.mx.development.module02.lesson12.join;

public class ThreadJoin extends Thread {
    // overriding the run method
    public void run() {
        for (int j = 0; j < 2; j++) {
            try {
                // sleeping the thread for 300 milli seconds
                Thread.sleep(300);
                System.out.println("The current thread name is: " + Thread.currentThread().getName());
            }
            // catch block for catching the raised exception
            catch (Exception e) {
                System.out.println("The exception has been caught: " + e);
            }
            //System.out.println(j);
        }
    }

}
