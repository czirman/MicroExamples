package org.czirman.callable;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallableImplementationTest {


    @Test
    public void runRunnable() throws ExecutionException, InterruptedException {

        MyCallableImplementation rOn =  new MyCallableImplementation(true);
        MyCallableImplementation rOff =  new MyCallableImplementation(false);

        ExecutorService executor = Executors.newFixedThreadPool(10);

        Future<Integer> futureOn = executor.submit(rOn);
        Future<Integer> futureOff = executor.submit(rOff);

        System.out.println(futureOn.get());
        System.out.println(futureOff.get());
    }

    @Test
    public void runAnonymousRunnable(){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " with Runnable: org.czirman.runnable.MyRunnableImplementation runs..." + i);
                }
            }
        });

        t1.start();
    }
}
