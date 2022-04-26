package org.czirman.runnable;

public class MyRunnableExceptionImpl implements Runnable {

    @Override
    public void run() /*throws Exception*/ {
        try {
            throw new Exception("Exception from Runnable");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}