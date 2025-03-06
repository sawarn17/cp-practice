package exceptionhandling;

//Custom excetion is extends the class of RunTimeException or the Exception
public class CustomExceptionDemo6 extends RuntimeException {
    
    public CustomExceptionDemo6(String message){
        super(message); // this message is passing to the Runtime Exception
    }

    public CustomExceptionDemo6(String message, Throwable t){
        super(message, t); // here we are passing message as well as throwable obj
    }
}
