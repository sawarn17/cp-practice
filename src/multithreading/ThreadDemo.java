package multithreading;

class ThreadEx extends Thread{
    
    public void run(){
        System.out.println("THIS IS THE THREAD DEMO");
    }
}

public class ThreadDemo {
   public static void main(String[] args) {
        Thread th = new ThreadEx();
        th.start();
   }
}
