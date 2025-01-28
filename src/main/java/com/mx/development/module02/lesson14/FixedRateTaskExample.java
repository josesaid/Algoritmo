package com.mx.development.module02.lesson14;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FixedRateTaskExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(2);

        // Schedule a task to run every 3 seconds, with an initial delay of 2 seconds
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            long epoch = Instant.now().toEpochMilli();
            System.out.print("Fixed rate task executed at " + epoch);
            LocalDateTime ldt = Instant.ofEpochMilli(epoch).atZone(ZoneId.systemDefault())
                    .toLocalDateTime();
            System.out.print(" -> " + ldt + "\n");

        }, 2, 3, TimeUnit.SECONDS);

        // Let the main thread sleep for 10 seconds to observe the
        // scheduled task execution
        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduledExecutorService.shutdown();
    }

}
