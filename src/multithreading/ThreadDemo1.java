package multithreading;

//this is used to create the threads in java : java.lang.Thred
class ThreadEx extends Thread{

    // it is by default declared in the Thread class need to ovrride them
    public void run(){
        System.out.println("THIS IS THE THREAD DEMO");
    }
}

public class ThreadDemo1 {
   public static void main(String[] args) {
        Thread th = new ThreadEx();
        th.start(); // start method is responsible to run the thread.
       //when we run multiple thread simuntaneously like th1, th2, th3..... then ::::
       //The order of thread execution may vary on each run because thread scheduling is non-deterministic.
   }
}
