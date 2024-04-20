package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RunnableWithFuture implements Runnable {

    @Override
    public void run() {
        System.out.println("WE ARE EXECUTING BY " + Thread.currentThread().getName());
    }
}

public class RunableWithExecutors {
    public static void main(String[] args) {
        // creating thread pool exe with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            //creating the instance of Runnbale Implemented class
            Runnable runnable = new RunnableWithFuture();
            //submitting the task to Execotors Frameworks
            executor.execute(runnable);
        }

        //to stop the Executors service
        executor.shutdown();
    }
}

/*
 *  OUT PUT IS 
WE ARE EXECUTING BY pool-1-thread-2
WE ARE EXECUTING BY pool-1-thread-3
WE ARE EXECUTING BY pool-1-thread-1
WE ARE EXECUTING BY pool-1-thread-3
WE ARE EXECUTING BY pool-1-thread-2
WE ARE EXECUTING BY pool-1-thread-3
WE ARE EXECUTING BY pool-1-thread-2
WE ARE EXECUTING BY pool-1-thread-3
WE ARE EXECUTING BY pool-1-thread-1
WE ARE EXECUTING BY pool-1-thread-2
 * 
 */
