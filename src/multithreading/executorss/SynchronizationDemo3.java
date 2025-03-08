package multithreading.executorss;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SynchronizationDemo3 {

    /*
     * 
     * Race Condition when two or more than two thread are try to update the mutual
     * shared resources.
     * 
     */

    private static int COUNT = 0;

    // here trying to update count it means how many time this function is invokeed
    public static void manageCounts() {
        COUNT += 1;
    }

    public static void createRaceCondition() throws InterruptedException {
        // Here we are createing 5 threads of fixsed pull size
        ExecutorService service = Executors.newFixedThreadPool(5);

        // We’re using an ExecutorService with a 5-threads pool to execute and increse the value of count 1000 times.
        IntStream.range(0, 1000)
                .forEach(count -> service.submit(SynchronizationDemo3::manageCounts));
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);

        System.out.println("NOW THE UPDATED VALUE OF COUNT ARE "+ COUNT);
        //It will print random number of counts like 970/978 etc
        //If we executed this serially, the expected output would be 1000, 
        //but our multi-threaded execution fails almost every time with an inconsistent actual output:

        service.shutdown();// closing of instance of exectors service manually
    }


    /*==========================================SYNCHRONIZED==============================================
     * 
     * There are three types of synchronized block
     *      1. Instance Method
     *      2. Static Method
     *      3. Synchronized Block
     * 
     * 
     */

    private static int SYNC_COUNT = 0;

    //if we removed static keyword then it becomes instance method of that class
    // Example of static synchronized method
    //These methods are synchronized on the Class object associated with the class. 
    //***Since only one Class object exists per JVM per class, only one thread can execute inside a static synchronized method per class, irrespective of the number of instances it has.    
    public static synchronized void synchronisedMethod() {
        SYNC_COUNT += 1;
    }

    public static void synchronizedMethodDemo() throws InterruptedException {
        // Here we are createing 5 threads of fixsed pull size
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // We’re using an ExecutorService with a 5-threads pool to execute and increse the value of count 1000 times.
        IntStream.range(0, 1000)
                .forEach(count -> executor.submit(SynchronizationDemo3::synchronisedMethod));
                executor.awaitTermination(1000, TimeUnit.MILLISECONDS);

        System.out.println("NOW THE UPDATED VALUE OF SYNC_COUNT ARE "+ SYNC_COUNT);
        // here output will be :::: NOW THE UPDATED VALUE OF SYNC_COUNT ARE 1000

        executor.shutdown();// closeing of instance of executors
    }


    public static void main(String[] args) {
        try {
            createRaceCondition();// triggring the function

            synchronizedMethodDemo();//calling of synchronised method
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
