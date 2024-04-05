package javautiltydemos.functionalinterfaceimpl;

import java.util.function.Consumer;

@FunctionalInterface // ensure interface could not have more than one function
interface  Test {
    public int getCustomOps(int x, int y);
}

/*
 * ===============   THIS IS FUNCTIONAL INTERFCE   ===========================
 * It have only one method to be exhabits it have only one abstrct method
 * It is used to Represent the instance of Lambda Experssion
 * It have Runnable, ActionListner , Comparable
 * Calling SAM (Single Abstract Method)
 * 
 * 
 */
public class FunctionalInterfaceDemo {

    //consumer interfec
    public static void consumerExample(int x){
         Consumer<Integer> display = a -> System.out.println(a);
         //applied with consumer
         display.accept(x);
    }


    public static void main(String[] args) {
        
        Test add = (x, y) -> x +y;
        Test sub = (x, y) -> x -y;
        Test multiply = (x, y) -> x * y;
        
        System.out.println("THE ADD OF NUMBER ARE "+ add.getCustomOps(6, 5));
        System.out.println("THE SUBS OF NUMBER ARE "+ sub.getCustomOps(6, 5));
        System.out.println("THE Multiply OF NUMBER ARE "+ multiply.getCustomOps(6, 5));

        System.out.println("======================CONSUMER EXAMPLE==========================");
        consumerExample(10);
    }
}
