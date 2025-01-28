package com.mx.development.module02.lesson14;

public class Task implements Runnable {
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Task " + name + " is being executed by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // Simulate long-running task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
