package com.mx.development.module02.lesson14;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.concurrent.*;

public class WorkStealingPoolExample {
    public static void main(final String[] arguments) throws InterruptedException {
        ExecutorService executor = Executors.newWorkStealingPool(2);

       for(int i=0; i<20; i++){
           executor.submit(new ThreadImpl());
       }

        // Let the main thread sleep for 10 seconds to observe the scheduled task execution
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.shutdown();

        //int procesadores = Runtime.getRuntime().availableProcessors();
        //System.out.println("procesadores: " + procesadores);
    }

}
