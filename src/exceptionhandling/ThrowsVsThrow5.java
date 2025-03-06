package exceptionhandling;

public class ThrowsVsThrow5 {
    
    /*
     *   Throws used in method signature it might be indicated that execption may be thrown at runtime
     * Here Nothing happens until exception is comes in picture
     */
    static void demoOfThrows() throws NullPointerException{

    }

    /*
     *  It is used to throw the new exception
     *  Here exception is thrown
     */
    static void demoOfThrow() throws NullPointerException{
        throw new NullPointerException("value is null");
    }

    static void demoOfThrowCustomException(){
        throw new CustomExceptionDemo6("THIS IS DEMO OF CUSTOM EXCEPTION THROWNs");
    }

    public static void main(String[] args) {
        demoOfThrows();
        demoOfThrow();
        demoOfThrowCustomException();
    }
}
