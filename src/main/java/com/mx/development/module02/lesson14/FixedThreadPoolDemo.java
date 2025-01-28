package com.mx.development.module02.lesson14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 7; i++) {
            Task task = new Task("Task " + i);
            executorService.submit(task);
        }

        executorService.shutdown();

        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                System.out.println("shutdown");
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }

        System.out.println("All tasks are finished.");
    }
}
