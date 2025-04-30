package interfaces;

import java.io.Serializable;

class Person implements Serializable {

    //A serialVersionUID is a unique identifier for a class. 
    //It is used during deserialization to ensure that a loaded class and the serialized object are compatible.

    //If you don't declare it, Java will generate one at runtime based on various factors like class name, fields, etc., 
    //but this can cause issues during deserialization if the class changes over time.
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    //not takes part in serlization
    private transient String password;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "THE DATA IN OBJECT ARE "+ this.name + " The age is "+ this.age;
    }
}

public class Serilizable8 {
    

    /*
     * import java.io.Serializable;
     * It's a marker interface, meaning it does not have any methods. **
     * In Java, serialization is the process of converting an object into a byte stream so that it can be:
     * persisted to a file or database,
     * transmitted over a network,
     * or stored in memory for later reconstruction (deserialization).
     * 
     * The reverse process of recreating the object from the byte stream is called deserialization.
     * If a superclass is not Serializable, its fields won't be serialized.
     * If feild are transitent then it not takes part in serilization.
     */
    public static void main(String[] args) {
        
    }
}
