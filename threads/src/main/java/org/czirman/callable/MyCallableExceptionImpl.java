package org.czirman.callable;

import java.util.concurrent.Callable;

public class MyCallableExceptionImpl implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        throw new Exception("Exception from Callable");
    }
}
