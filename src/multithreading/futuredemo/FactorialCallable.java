package multithreading.futuredemo;

import java.util.concurrent.*;

public class FactorialCallable implements Callable<Long> {

    private int num;

    public FactorialCallable(int num){
        this.num = num;
    }

    @Override
    public Long call() throws Exception {
        return factorial(num);
    }

    public Long factorial(int num){
        long res = 1;
        while(num > 0){
            res *= num;
            num--;
        }
        return res;
    }

    public static void main(String[] args) {
        int numberToFactorialize = 10;

        // Create a thread pool with a single thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Create a FactorialCallable instance
        FactorialCallable factorialCallable = new FactorialCallable(numberToFactorialize);

        try {
            // Submit the Callable to the executor
            Future<Long> future = executor.submit(factorialCallable);

            // Get the result from the Future
            long factorialResult = future.get();

            System.out.println("Factorial of " + numberToFactorialize + " is: " + factorialResult);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Shutdown the executor
            executor.shutdown();
        }
    }
}
