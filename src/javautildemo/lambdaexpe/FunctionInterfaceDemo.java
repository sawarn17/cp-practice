package javautildemo.lambdaexpe;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceDemo {

    private int performOperation(int x, int y, MultipleArgsFunction mf) {
        return mf.multipleParameter(x, y);
    }

    public static void main(String[] args) {
        System.out.println("the fata ");
        FunctionalInterfaceDesign fc = (int x) -> System.out.println(2 * x);
        fc.functionDemo(5);
        fc.defaultFunction();

        // calling of multiple args param
        MultipleArgsFunction add = (int x, int y) -> x + y;
        MultipleArgsFunction multiply = (int x, int y) -> x * y;
        MultipleArgsFunction divide = (int x, int y) -> x / y;

        // here issue comes due to static non static
        FunctionInterfaceDemo fd = new FunctionInterfaceDemo();

        System.out.println(fd.performOperation(6, 4, add));
        System.out.println("Value of Multiplication " + multiply.multipleParameter(4, 7));
        System.out.println("the function with divide are " + divide.multipleParameter(6, 3));

        // functional interface that transformlist data to a string
        List<Integer> allNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Function<List<Integer>, String> convertToString = data -> data.toString();
        System.out.println("the details of that convert list to a string" + convertToString.apply(allNumbers));

    }
}
