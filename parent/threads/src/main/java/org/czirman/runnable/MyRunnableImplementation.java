package org.czirman.runnable;

public class MyRunnableImplementation implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " with Runnable: org.czirman.runnable.MyRunnableImplementation runs..." + i);
        }
    }
}