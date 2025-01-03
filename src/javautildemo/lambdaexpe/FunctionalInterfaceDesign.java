package javautildemo.lambdaexpe;

@FunctionalInterface
interface FunctionalInterfaceDesign {
    void functionDemo(int i);

    default void defaultFunction() {
        System.out.println("Hi i am a default function");
    }

}
