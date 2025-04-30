package interfaces;

public class FunctionalInterfaceImpl3 {
    
    // this is that value that stores data
    private static int applyFunctionalImpl;
    private static int functionalAddedValue;

    public static void main(String[] args) {
        FunctionalInterfaceDemo2 functionalMulti = (int i, int j)-> i*j;

        FunctionalInterfaceDemo2 functionalAdd = (int i, int j)-> i+j;

        //executing the funactional interface
        applyFunctionalImpl = functionalMulti.applyFunctionalImpl(5, 5);

        //adding of a number using the funct
        functionalAddedValue = functionalAdd.applyFunctionalImpl(20, 30);

        System.out.println("THE VALUE FROM FUNCTIONAL INTERFACE ARE "+ applyFunctionalImpl);
        System.out.println("THE sum from the functional interface are "+ functionalAddedValue);
    }

}
