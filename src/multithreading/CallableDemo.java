package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//here we have to mentioned the return type of the Callable<ReturnTypeFromCallFunction>
class FactWithCallable implements Callable<Long>{

    private Long num;
    private Long fact=1L;

    public FactWithCallable(Long num){
        this.num = num;
    }

    @Override
    public Long call(){
        if(num < 0){
            throw new IllegalArgumentException("Num should be greater than 0");
        }
        
        while(num >1){
            fact = fact * num;
            num --;
        }
        return fact;
    }
}


public class CallableDemo {

    public static void main(String[] args) {
        
        //creating instance of FactWithCallable
        FactWithCallable fact = new FactWithCallable(5L);
        //here we are taking the Executors Service in this
        ExecutorService exec = Executors.newSingleThreadExecutor();
        //submitting task to Future
        Future<Long> facFuture = exec.submit(fact);

        try {
            //Now retrive the data from the Future
            Long res = facFuture.get();
            System.out.println("THE FACT FROM CALLABLE ARE "+ res);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //cancle the future otherwise it is continous running in mode
        facFuture.cancel(true);

        // Shutdown ExecutorService :: IT terminates the program ie end the program when 
        //lifecycle is terminated
        exec.shutdown();
    }
    
}
