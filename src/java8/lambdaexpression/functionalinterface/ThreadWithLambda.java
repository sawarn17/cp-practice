package java8.lambdaexpression.functionalinterface;

//this is the demo to start the thread using lambda expression
public class ThreadWithLambda {

    public static void main(String[] args) {

        //createing anonymous class
        new Thread( new Runnable(){
            @Override
            public void run(){
                System.out.println("THERAD IS CREATED");
            }
        })
        .start();
    }
    
}
