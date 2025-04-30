package interfaces;

public interface InterfaceA {

    // we cant declare instance with private specifier.
    // varibels are only static final or public in nature.
    int sum=5;
    static int staticMethodDemo = 10;
    
    public void publicMethod1();

    // when we declare method without specifier then by default it is a public in nature.
    void defaultMethod1();

    // when we declare a method private inside interface then it requires body of that method.
    // This method requires a body instead of a semicolon : give error while declaring
    private void privateMethod(){
       // when we define method as a private then we need to provide the body of that method.
    }


    // default method demo
    public default int defaultMethod(){
        return sum;
    }
}
