package java8.functionalinterfacedemo;

import java.util.function.Consumer;


// It is a just a informataive annoation
@FunctionalInterface
// **ensure interface could not have more than one function
interface FunctionInterface {
    public int getCustomOps(int x, int y);
}

@FunctionalInterface
interface FunctionInterfaceWithDefaultMethod {
    public int getCustomOps(int x, int y);

    public default void defaultMethodInFunctionalInterface(){
        System.out.println("THIS IS EXAMPLE OF DEFAULT METHOD IN JAVA:::");
    }
}

public class FunctionalInterface1 {

    // consumer interfec
    // passing single argumnets
    public static void consumerExample(int x) {
        Consumer<Integer> display = a -> System.out.println(a);
        // applied with consumer
        display.accept(x);
    }

    /*java.util.function 
     *---**Any interface with a SAM(Single Abstract Method) is a functional interface
     * And its implementation may be treated as lambda expressions. 
     * Note that Java 8’s default methods are not abstract and do not count 
     * Functional Interface may have multiple default method in it.
     * 
     */

    public static void main(String[] args) {

        FunctionInterface add = (x, y) -> x + y;
        FunctionInterface sub = (x, y) -> x - y;
        FunctionInterface multiply = (x, y) -> x * y;

        System.out.println("THE ADD OF NUMBER ARE " + add.getCustomOps(6, 5));
        System.out.println("THE SUBS OF NUMBER ARE " + sub.getCustomOps(6, 5));
        System.out.println("THE Multiply OF NUMBER ARE " + multiply.getCustomOps(6, 5));

        System.out.println("======================CONSUMER EXAMPLE==========================");
        consumerExample(10);
    }
}
