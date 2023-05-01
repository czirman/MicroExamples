package org.czirman.callable;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallableExceptionImplTest {

    @Test
    public void runRunnableWithException() throws Exception {
        MyCallableExceptionImpl exp = new MyCallableExceptionImpl();
        ExecutorService executor = Executors.newFixedThreadPool(10);

        try {
            Future<Integer> future = executor.submit(exp);
        }
        catch (Exception e){
            System.out.println(e);
        }

        // Nie wiem czemu wyjątek sie na konsoli nie wyświetla
    }
}
