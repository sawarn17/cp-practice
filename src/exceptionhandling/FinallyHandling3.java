package exceptionhandling;

public class FinallyHandling3 {

    /*
     * =========================Finally Block Demo=======================
     * 
     * 
     * 
     */

    static void finallyKeywordDemo(){
        String stm = null;
        try {

            System.out.println("THE MAIN TRY BLOCK"+ stm.toLowerCase());
        } catch (Exception e) {
            System.out.println("THE catch BLOCK");
        }finally{
            /*
             * Finally Block is always executed even the exception is thrown from the main
             */
            System.out.println("THE FINALLY Block Always Executed");
        }
    }
 
    public static void main(String[] args) {
        finallyKeywordDemo();
    }
}
