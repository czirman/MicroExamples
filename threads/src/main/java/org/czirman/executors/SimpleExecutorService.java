package org.czirman.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SimpleExecutorService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

        Callable<String> callableTask = () -> {
            TimeUnit.MILLISECONDS.sleep(300);
            return "Task's execution";
        };

        List<Callable<String>> callableTasks = new ArrayList<>();
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);

        Future<String> result = executorService.submit(callableTask);
        System.out.println(result.get());

        executorService.shutdown();

    }

}
