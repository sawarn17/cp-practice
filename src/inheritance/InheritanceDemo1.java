package inheritance;


// by default every method inherits objects class
class One{
    private int temp=1;

    public One(){
        System.out.println("CLASS ONE");
    }

    public int getTemp(){
        return this.temp;
    }
}

class Two extends One{
    private int temp=2;

    public Two(){
        System.out.println("CLASS TWO");
    }

    public int getTemp(){
        return this.temp;
    }
}

class Three extends Two{
    private int temp=3;

    public Three(){
        System.out.println("CLASS Three");
    }

    public int getTemp(){
        return this.temp;
    }
}

final class Four extends Three{
    private int temp=4;

    //If we make the consurtor as a private then we can't create object from outside of that class
    private Four(){
        System.out.println("CLASS Three");
    }

    public int getTemp(){
        return this.temp;
    }
}

/* ------------------------------------------------------------------------------------------------------
   THIS IS NOT POSSIBLE BCZ 

 * Implicit super constructor Four() is not visible. Must explicitly invoke another constructorJava(134217872)
 */
// class Five extends Four{
//     private int temp=5;

//     // private Five(){
//     //     System.out.println("CLASS Three");
//     // }

//     public int getTemp(){
//         return this.temp;
//     }
// }


final class Six extends Three{
    private int temp=6;

    public Six(){
        System.out.println("CLASS Six");
    }

    public int getTemp(){
        return this.temp;
    }
}

////** We can't extends the final class
/// ERROR IS : The type Seven cannot subclass the final class Six
// class Seven extends Six{
//     private int temp=7;

//     public Seven(){
//         System.out.println("CLASS Seven");
//     }

//     public int getTemp(){
//         return this.temp;
//     }
// }

//-------------------------------------------------------------------------------------------------------

public class InheritanceDemo1 {

    /*
     * Mainly used for code reuseability
     * 
     */

    public static void main(String[] args) {

        //Parent Can hold the refence of child class object
        // Here firstly object of parent class is created and so on to the child class
        One oneClassObj = new Three();
        //output is: CLASS ONE -> CLASS TWO -> CLASS Three

        System.out.println("THE VALUE SHOLUD BE ACESS :: "+ oneClassObj.getTemp());
        //output : THE VALUE SHOLUD BE ACESS :: 3 

        Two twoClassObj = new Three();
        System.out.println("THE OBJECT OF CLASS TWO "+ twoClassObj.getTemp());
        //output : THE OBJECT OF CLASS TWO 3

        One oneClassObj1 = new Two();
        System.out.println("THE OBJECT OF CLASS TWO "+ oneClassObj1.getTemp());
        //output : THE OBJECT OF CLASS TWO 2

        //** 
        //Three thObject = new Two();
        // Type Mismatch error ** Child can't hold the refrence of parent

        //
        Six four = new Six();
        System.out.println("THE OBJCT IN FOUR CLASS ARE "+ four.getTemp());
        /*
         * CLASS ONE
           CLASS TWO
           CLASS Three
           CLASS Six
           THE OBJCT IN FOUR CLASS ARE 6
         */
        
    }
    
}
