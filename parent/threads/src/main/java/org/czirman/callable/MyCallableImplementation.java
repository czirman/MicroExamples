package org.czirman.callable;

import java.util.concurrent.Callable;

public class MyCallableImplementation implements Callable<Integer> {

    private final Boolean on;

    public MyCallableImplementation(Boolean on) {
        this.on = on;
    }

    @Override
    public Integer call() throws Exception {
        if (on) {
            System.out.println(Thread.currentThread().getName() + " is on");
            return 1;
        } else {
            System.out.println(Thread.currentThread().getName() + " is off");
            return 0;
        }
    }
}
