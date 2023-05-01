package org.czirman.tuts;

import java.util.concurrent.atomic.AtomicInteger;

class CounterAtomic {
    private AtomicInteger value = new AtomicInteger();

    public void increment() {
            value.incrementAndGet();
    }

    public int getValue() {
        return value.get();
    }
}

public class RaceAtomic {
    public static void main(String[] args) throws InterruptedException {
        CounterAtomic c = new CounterAtomic ();
        Runnable r = () -> {
            for (int i = 0; i < 100_000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(c.getValue());
    }
}