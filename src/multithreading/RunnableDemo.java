package multithreading;

class RunnableEx implements Runnable{

    @Override
    public void run() {
        System.out.println("THIS IS RUNNABLE THREAD");
    }
    
}

public class RunnableDemo {
    public static void main(String[] args) {
        //here we need to pass the Implementation class of runable
        Thread run = new Thread(new RunnableEx());
        run.start();

        //with runnable instance
        Runnable runnable = new RunnableEx();
        runnable.run();
    }
}
