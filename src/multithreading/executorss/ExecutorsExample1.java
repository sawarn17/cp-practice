package multithreading.executorss;

import java.util.concurrent.Executor;

public class ExecutorsExample1 implements Executor {

    /*
     * ====================================Executors(Interface)=====================
     * ===================
     * Implementation classes of it
     * AbstractExecutorService, ForkJoinPool, ScheduledThreadPoolExecutor,
     * ThreadPoolExecutor
     * 
     * 
     * And SubInterface are : ExecutorService, ScheduledExecutorService
     * 
     * In Details :
     * It Represents object that can execute the Runable Tasks. or Provided Taks.
     * The Exeution of this is dependent upon Implementation(ie method of
     * executions)
     * It might be started on main thread or create a new Thread before Startig it.
     * 
     * ** So We can sepratly execute the task : decouple it from main thread
     * execution
     * 
     * 
     * 
     * 
     */

    @Override // This is the overridern method of the Exector
    public void execute(Runnable command) {
        if (command == null)
            throw new IllegalArgumentException("Runnable command cannot be null");
        command.run();// this is to start the method of execution
    }

    public static void main(String[] args) {
        ExecutorsExample1 exe = new ExecutorsExample1();

        //executing the exectors by main thread;
        exe.execute(()->{
            System.out.println("Task is being executed by: " + Thread.currentThread().getName());
            //output : Task is being executed by: main
        });
    }
}
