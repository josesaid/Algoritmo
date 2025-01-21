package com.mx.development.module02.lesson12.example02;

public class Game {

    //counter - it is a field modifier keyword that allows threads to read from the shared memory.
    private static volatile int counter = 0;
    // It is applicable to variables only
    private static class Player extends Thread {
        @Override
        public void run() {
            // Simulate some game events
            for (int i = 0; i < 1000; i++) {
                // Update the counter
                counter++;
                System.out.println("Player updated counter: " + counter);
            }
        }
    }

    public static void main(String[] args) {
        // Create multiple player threads
        Player player1 = new Player();
        Player player2 = new Player();

        player1.start();
        player2.start();
    }

}
