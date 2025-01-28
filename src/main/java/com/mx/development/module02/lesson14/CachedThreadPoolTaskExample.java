package com.mx.development.module02.lesson14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class CachedThreadPoolTaskExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ThreadPoolExecutor mypool = (ThreadPoolExecutor)  executorService;
        System.out.println("size of mypool: " + mypool.getPoolSize());

        // Submit tasks to the executor service
        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            executorService.submit(() -> {
                System.out.println("Task 1, " + taskId + " executed by " + Thread.currentThread().getName());
            });
            executorService.submit(() -> {
                System.out.println("Task 2, " + taskId + " executed by " + Thread.currentThread().getName());
            });
        }
        System.out.println("size of mypool: " + mypool.getPoolSize());
        executorService.shutdown();
    }

}
