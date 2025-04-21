package javawithoops.finalkeyworddemo;

final class TestOfFinal{
    int age=0;

    final int setAgeByParams(int age){
        return this.age = age;
    }
}

/* 1.1
 * we cant extends the final class
        class ExtendsOfFinal extends TestOfFinal{
        //editor gives error like : The type ExtendsOfFinal cannot subclass the final class TestOfFinalJava
    }
    But we can modfieds the final class instance members.
 * 
 */
//----------------------------------------------------------------------------------------------
 /*
  * 1.2
    Final Method can't be ovverriden in its child class

  */

class TestFinalMethod{
    int age =0;

    // this is the final method
    public final int setAge(int age){
        return this.age = age;
    }
}

class TestOfFinalMethodOvverriden extends TestFinalMethod{

    //trying to ovverride the method
    // public final int setAge(int age){
    //     return this.age = age;
    // }

    //OP: ERRORS :::: Cannot override the final method from TestFinalMethodJava
}


class FinalVaribleDemo{
    private final String finalStringDemo = null;

    public String getValues(){
        //finalStringDemo = "REASSIGNEDING VALUES";
        //OP: ERROS: :::The final field FinalVaribleDemo.finalStringDemo cannot be assigned
        return finalStringDemo;
    }
    //--Main things we can't reassigned values of a final variable.

    public int opsOnFinalVarible(final int x){
        //x++;
        //OP : ERRORS::::The final local variable x cannot be assigned. It must be blank and not using a compound 
        return x;
    }

}

public class FinalKeyWordDemo1 {

    
    public static void main(String[] args) {
        
    }
}
