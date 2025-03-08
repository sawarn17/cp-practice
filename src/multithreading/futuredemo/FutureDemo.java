package multithreading.futuredemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {
    

    public static void main(String[] args) {
        Executor executor = Executors.newSingleThreadExecutor();
        Future<Long> futureResult = ((ExecutorService) executor).submit(new FactorialCallable(10));
    }
}
