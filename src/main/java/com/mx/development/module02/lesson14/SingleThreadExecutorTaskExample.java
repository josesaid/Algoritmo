package com.mx.development.module02.lesson14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class SingleThreadExecutorTaskExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Submit tasks to the executor service
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2 * 1000); // Simulate a long-running task
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executorService.shutdown();
    }

}
