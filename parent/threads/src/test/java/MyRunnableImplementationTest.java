import org.junit.jupiter.api.Test;

public class MyRunnableImplementationTest {

    @Test
    public void runRunnable(){

        MyRunnableImplementation r =  new MyRunnableImplementation();

        Thread t1 = new Thread(r, "Thread-1");
        Thread t2 = new Thread(r, "Thread-2");

        t1.start();
        t2.start();
    }

    @Test
    public void runAnonymousRunnable(){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " with Runnable: MyRunnableImplementation runs..." + i);
                }
            }
        });

        t1.start();
    }
}
