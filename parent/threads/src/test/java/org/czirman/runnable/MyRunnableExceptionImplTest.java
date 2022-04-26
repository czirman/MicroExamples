package org.czirman.runnable;

import org.czirman.runnable.MyRunnableExceptionImpl;
import org.junit.jupiter.api.Test;

public class MyRunnableExceptionImplTest {

    @Test
    public void runRunnableException() {

        Thread thread = new Thread(new MyRunnableExceptionImpl());
        thread.start();

    }
}
