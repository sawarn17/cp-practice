package exceptionhandling;

public class BasicOfException1 {

    /*https://docs.oracle.com/javase/tutorial/essential/exceptions/runtime.html
     * =========================================EXCEPTION HANDLING==================================================
     * It Allows devloper to manage and handled errors 
     * 
     * An Exception is unwanted and unexpected Exception occures At Run time.
     * 
     *            Throwable(Parent Class)
     *                   |
     *        ----------------------------------------------------
     *        |                                                   |
     *     Exception(Checked)                                Error(Un Checked)
     *                                              StackOverflowError|NoClassDefFoundError|OutOfMemoryError
     *        |
     *      -----------------------------------------------
     *      |                                              |
     *    Compile Time Exception                RunTime Exception or UnCheked Exception(NPE, ArrayIndexOutOfBound)
     * 
     */
    
    public static void main(String[] args) {
        System.out.println("THE MAIN BAISC SETUP");
    }
}
