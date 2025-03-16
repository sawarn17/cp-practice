package java8.functionalinterfacedemo;

import java.util.function.Consumer;

@FunctionalInterface // ensure interface could not have more than one function
interface  FunctionInterface {
    public int getCustomOps(int x, int y);
}

public class FunctionalInterface1 {
    

     //consumer interfec
    public static void consumerExample(int x){
         Consumer<Integer> display = a -> System.out.println(a);
         //applied with consumer
         display.accept(x);
    }


    public static void main(String[] args) {
        
        FunctionInterface add = (x, y) -> x +y;
        FunctionInterface sub = (x, y) -> x -y;
        FunctionInterface multiply = (x, y) -> x * y;
        
        System.out.println("THE ADD OF NUMBER ARE "+ add.getCustomOps(6, 5));
        System.out.println("THE SUBS OF NUMBER ARE "+ sub.getCustomOps(6, 5));
        System.out.println("THE Multiply OF NUMBER ARE "+ multiply.getCustomOps(6, 5));

        System.out.println("======================CONSUMER EXAMPLE==========================");
        consumerExample(10);
    }
}
