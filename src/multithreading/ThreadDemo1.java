package multithreading;

//this is used to create the threads in java
class ThreadEx extends Thread{
    
    public void run(){
        System.out.println("THIS IS THE THREAD DEMO");
    }
}

public class ThreadDemo1 {
   public static void main(String[] args) {
        Thread th = new ThreadEx();
        th.start();
   }
}
