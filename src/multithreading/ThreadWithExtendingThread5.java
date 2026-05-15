package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//approach 1
class ThreadWithExtendingThread5 extends Thread {

    @Override
    public void run() {
        System.out.println("Extended Thread is running... with name..... "+ Thread.currentThread().getName());
        //op : Thread is running... with name..... Thread-0
        // Because here onlyOneThread in running state : When multiple thread the Thread-0, Thread-1 and so on
    }
}

//approach : 2
class ThreadWithImplThread implements Runnable{

    @Override
    public void run() {
       System.out.println("Implemented Thread is running... with name..... "+ Thread.currentThread().getName());
    }
    
}

public class ThreadCreationWithDIffrentMethod {

    public static void main(String[] args) {

        //approach 1
        ThreadWithExtendingThread thread = new ThreadWithExtendingThread();
        thread.start();


        //approach 2: 
        //Thread class can hold the reference of the runnable class
        Thread runnable = new Thread(new ThreadWithImplThread());
        runnable.start(); //Here we need to call start method

        //When we want to run the new thread then we have to create object for same
        //other wise it returns error 
        Thread runnable2 = new Thread(new ThreadWithImplThread());
        runnable2.start(); 
        //runnable2.start(); : second start leads to be RTE: 
        /* RTE IS ::::::::::::::::::::::::::::::::::::::::::::::::::::::
            java.lang.IllegalThreadStateException
            at java.base/java.lang.Thread.start(Thread.java:802)
            at Competive_Programming/javaprac.mutilthreading.ThreadCreationWithDIffrentMethod.main(ThreadCreationWithDIffrentMethod.java:42)
        */

        /*
        OP :------------------------------------------------------

            Implemented Thread is running... with name..... Thread-1
            Implemented Thread is running... with name..... Thread-2
            Extended Thread is running... with name..... Thread-0
        
        */

    
        //Executing thread with runnable interface instance
        //creating implementation class obj
        Runnable runnable3 = new ThreadWithImplThread();
        runnable3.run();




        //Approach 3:::
        Thread threadWithLambdaExp = new Thread(()->{
            System.out.println("LambdaExpression Thread is running... with name..... "+ Thread.currentThread().getName());
        });
        //need to start the thread
        threadWithLambdaExp.start(); //op : LambdaExpression Thread is running... with name..... Thread-3



        //Approach 4::::::::::::::BY Managing Thread Pool
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //Here we are creating thread pool with 3 thread 
        //Executor Service is a part of the concurrent package
        //java.util.concurrent.ExecutorService

        //when we going to subkit then we need to pass the runnable things
        executorService.submit(()->{
            System.out.println("ExecutorService Based Exe-Thread-1 is running... with name..... "+ Thread.currentThread().getName());
        }); 

        executorService.submit(()->{
            System.out.println("ExecutorService Based Exe-Thread-2 is running... with name..... "+ Thread.currentThread().getName());
        }); 

        executorService.submit(()->{
            System.out.println("ExecutorService Based Exe-Thread-3 is running... with name..... "+ Thread.currentThread().getName());
        }); 

        /*
            Output :
                ExecutorService Based Exe-Thread-1 is running... with name..... pool-1-thread-1
                ExecutorService Based Exe-Thread-2 is running... with name..... pool-1-thread-2
                ExecutorService Based Exe-Thread-3 is running... with name..... pool-1-thread-3
        */

        executorService.shutdown();// need to manually shutdown thread
    }
}
