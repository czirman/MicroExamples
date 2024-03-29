package org.czirman.tuts;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class VolatileExample {
    private static  boolean isDone = false;

    public static void main(String[] args) {
        Thread backgroundJob = new Thread(() -> {
            try {
                Thread.sleep(Duration.ofSeconds(2).toMillis());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I'm done with my job!");
            isDone = true;
        });
        Thread heavyWorker = new Thread(() -> {
            LocalDateTime start = LocalDateTime.now();
            System.out.println("start");
            int i=0;
            while (!isDone) {

                //System.out.println("work work work");
                //i++;
                System.out.println(i++);
                // constantly doing some important stuff
            }
            long durationInMillis = ChronoUnit.MILLIS.between(start, LocalDateTime.now());
            System.out.println("I've been notified about finished job after " + durationInMillis + " milliseconds.");
        });

        heavyWorker.start();
        backgroundJob.start();
    }
}