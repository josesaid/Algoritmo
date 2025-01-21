package com.mx.development.module02.lesson12.join;

public class ThreadJoinExample {
    // main method
    public static void main(String argvs[]) {
        // creating 3 threads
        ThreadJoin th1 = new ThreadJoin();
        th1.setName("A");

        ThreadJoin th2 = new ThreadJoin();
        th2.setName("B");

        ThreadJoin th3 = new ThreadJoin();
        th3.setName("C");

        // thread th1 starts
        th1.start();

        // starting the second thread after when
        // the first thread th1 has ended or died.
        try {

            if(Thread.currentThread().getName().equalsIgnoreCase("main")) {
                System.out.println("join in the main");
                /*//Thread.currentThread().join();
                Thread.currentThread().interrupt();
                System.out.println("Main esta interrumpido?: " + Thread.currentThread().isInterrupted());
            }*/
            }
            System.out.println("The current thread name is: " + Thread.currentThread().getName());
            // invoking the join() method
            th1.join();
        }
        // catch block for catching the raised exception
        catch (Exception e) {
            System.out.println("The exception has been caught " + e);
        }
        // thread th2 starts
        th2.start();

        // starting the th3 thread after when the thread th2 has ended or died.
        try {
            System.out.println("The current thread name is: " + Thread.currentThread().getName());
            th2.join();
        }

        // catch block for catching the raised exception
        catch (Exception e) {
            System.out.println("The exception has been caught " + e);
        }

        // thread th3 starts
        th3.start();
    }

}
