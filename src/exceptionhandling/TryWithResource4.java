package exceptionhandling;

import java.io.File;
import java.io.PrintWriter;

public class TryWithResource4 {

    /*
     * ===========================TRY WITH RESOURCE===============================
     * In Java 7 we don't need to forcefully close the resources utilised by code it
     * means finally block
     * ** It extends the AutoCloseable to handle this
     * 
     * allows us to declare resources to be used in a try block with the assurance
     * that the resources will be closed after
     * the execution of that block.
     * The resources declared need to implement the AutoCloseable interface.
     * 
     * we are just using the try with resource it kept the when block of code is
     * executed the resource is
     * automatically removed
     */

    static void tryWithResourceDemo() {
        
    }

    public static void main(String[] args) {
        tryWithResourceDemo();
    }
}
