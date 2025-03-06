package exceptionhandling;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class TryCatchExample2 {

    /*
     * To Prevent and Handling of Exception we are using Try Catch Block
     * 
     */

    static void tryCatchExample() {
        String temp = null;
        try {
            System.out.println(temp.toCharArray());
        } catch (NullPointerException npe) {
            System.out.println("EXCEPTION IS GENRated Due to String is Pointing to null");

            npe.printStackTrace();// it will print all the tace relted to Exception
            npe.getCause(); // This wil give the object of throwable simply

            System.out.println("npe.getMessage()" + npe.getMessage());// It will give the message of exception Need
            // to Print it By Default the Message comes from JVM actual cause
        }
    }

    static int multipleTrycatchDemo(String playerFile) {
        // here we are using try with resource
        try (Scanner contents = new Scanner(new File(playerFile))) {
            return Integer.parseInt(contents.nextLine());
        } catch (IOException e) {
            return 0;
            // we can associate multiple catch block according to our need
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    static int unionCatchBlockDemo(String playerFile) {
        try (Scanner contents = new Scanner(new File(playerFile))) {
            return Integer.parseInt(contents.nextLine());
        } catch (IOException | NumberFormatException e) {
            // In a single can we can associate multiple exceptions there behvaior like or
            // operator
            return 0;
        }
    }

    //demo of wrapping and rethrowing exception
    static void wrappingAndRethorwingException(String playersFile) throws NullPointerException {
        try {
            // ...
        } catch (NullPointerException io) {
            throw io;
        }
    }

    public static void main(String[] args) {
        tryCatchExample();
    }
}
