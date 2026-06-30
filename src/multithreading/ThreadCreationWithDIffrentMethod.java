package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Approach 1: Extending Thread class
class ThreadWithExtendingThread extends Thread {

    @Override
    public void run() {
        System.out.println("Extended Thread is running... with name: "
                + Thread.currentThread().getName());

        // Output:
        // Extended Thread is running... with name: Thread-0
        // When multiple threads are created, names become Thread-1, Thread-2, etc.
    }
}

// Approach 2: Implementing Runnable interface
class ThreadWithImplThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Implemented Thread is running... with name: "
                + Thread.currentThread().getName());
    }
}

public class ThreadCreationWithDIffrentMethod {

    public static void main(String[] args) {

        // ==========================
        // Approach 1: Extend Thread
        // ==========================
        ThreadWithExtendingThread thread = new ThreadWithExtendingThread();
        thread.start();

        // ==============================
        // Approach 2: Implement Runnable
        // ==============================
        Thread runnable = new Thread(new ThreadWithImplThread());
        runnable.start();

        // Create another Thread object to execute the same Runnable
        Thread runnable2 = new Thread(new ThreadWithImplThread());
        runnable2.start();

        //Thread creation by lambda expression
        Runnable myThread = () -> {
            // Used to set custom name to the current thread
            Thread.currentThread().setName("myThread");
            System.out.println(
                    Thread.currentThread().getName()
                            + " is running");
        };

        // Instantiating Thread class by passing Runnable
        // reference to Thread constructor
        Thread run = new Thread(myThread);
        run.start();//to start the thread

        /*
         * Calling start() again on the same Thread object throws:
         *
         * java.lang.IllegalThreadStateException
         *
         * Uncomment to see the exception.
         */
        // runnable2.start();

        /*
         * Possible Output:
         *
         * Extended Thread is running... with name: Thread-0
         * Implemented Thread is running... with name: Thread-1
         * Implemented Thread is running... with name: Thread-2
         */

        // ==============================================
        // Calling run() directly (NOT creating new thread)
        // ==============================================
        Runnable runnable3 = new ThreadWithImplThread();
        runnable3.run();

        /*
         * Output:
         * Implemented Thread is running... with name: main
         *
         * Since run() is called directly, it executes on the main thread.
         */

        // ===================================
        // Approach 3: Lambda Expression
        // ===================================
        Thread threadWithLambdaExp = new Thread(() -> {
            System.out.println("Lambda Thread is running... with name: "
                    + Thread.currentThread().getName());
        });

        threadWithLambdaExp.start();

        // ===================================
        // Approach 4: ExecutorService
        // ===================================
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(() -> {
            System.out.println("ExecutorService Task-1 running... "
                    + Thread.currentThread().getName());
        });

        executorService.submit(() -> {
            System.out.println("ExecutorService Task-2 running... "
                    + Thread.currentThread().getName());
        });

        executorService.submit(() -> {
            System.out.println("ExecutorService Task-3 running... "
                    + Thread.currentThread().getName());
        });

        /*
         * Sample Output:
         *
         * ExecutorService Task-1 running... pool-1-thread-1
         * ExecutorService Task-2 running... pool-1-thread-2
         * ExecutorService Task-3 running... pool-1-thread-3
         */

        // Always shut down ExecutorService
        executorService.shutdown();
    }
}