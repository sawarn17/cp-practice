package abstractdemo;

abstract class  AbstractDemo {
    private int absInt=5;
    public static int static_number =20;
    public final int finalNumber = 25;
    int visibleNumber =30;

    private int getAbsInt(){
        return this.absInt;
    }

    public final void demoFinalMetod(){
        System.out.println("THIS IS THE VALUE OF FINAL METHOD");
    }

    //private method could not be overriden
    public abstract void methodToBeOvrridern();

    // A single abstract class have multiple abstract method in it.
    public abstract void methodToBeOvrridern1();
    
    //it may contains static method also
    static void staticMethodDemo(){
        System.out.println("THIS IS THE STATIC METHOD EXAMPLE");
    }

    // public abstact void testAbsractImpl(){
    // we could not define the method body while making method abstract
    // }
}

class AbsConcreteClass extends AbstractDemo{
    //it can return the value from the Concrete class
    private int absInt=10;
    public int getAbsInt(){
        return absInt;
    }

    public void accessDataFromAbstractclass(){
        System.out.println("THE DATA FROM ABSTRACT CLASS ARE "+ visibleNumber);
    }

    //we must need to ovveride the method
    @Override
    public void methodToBeOvrridern() {
       System.out.println("THIS IS OVERRIDEN METHOD");
    }
    
    //Here we can't acess the static method
    //AbstractClassDemo.staticMethodDemo();
    protected void acessStaticDataMember(){
        System.out.println("THE STATIC DATA MEMBER ARE "+ static_number);
    }

    protected void acessingFinalDataMemberOfAbstractClass(){
        System.out.println("The final member are "+ finalNumber);
    }

    @Override
    public void methodToBeOvrridern1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'methodToBeOvrridern1'");
    }
}

public class AbstractClassDemo {

        /*
    * declared with abstract keyword preceding with class keyword
    * may have abstract method or not 
    * it may contains final method but abstract method could not be final in nature
    * if we want to provide implemention of the method then it must declared with abstract
    * sub class must need to provide the all implementation for abstract class
    * if subclass do not want to provide the implementation then subclass must be abstract in nature
    */

    public static void main(String[] args) {
        AbsConcreteClass abs = new AbsConcreteClass();
        System.out.println(abs.getAbsInt());
        abs.accessDataFromAbstractclass();
        abs.demoFinalMetod();
        abs.methodToBeOvrridern();


        //acessing of static method of the Absract class
        AbstractDemo.staticMethodDemo();
        //calling static data member value
        abs.acessStaticDataMember();
        //final member acess
        abs.acessingFinalDataMemberOfAbstractClass();
    }
}
