package designpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

/**
 * A Singleton class demonstrating thread-safe implementation,
 * ways to break the pattern, and how to defend against them.
 */
class SingletonDemo1 implements Serializable, Cloneable {
    
    // volatile ensures changes are immediately visible across threads
    private static volatile SingletonDemo singleton;
    
    /**
     * Private constructor to prevent external instantiation.
     * DEFENSE AGAINST REFLECTION: Throw an exception if an instance already exists.
     */
    private SingletonDemo() {
        if (singleton != null) {
            throw new RuntimeException("Use getSingleTonInstance() method to get the single instance.");
        }
    }
    
    /**
     * Thread-safe double-checked locking implementation.
     */
    public static SingletonDemo getSingleTonInstance() {
        if (singleton == null) { // First check (no locking)
            synchronized (SingletonDemo.class) {
                if (singleton == null) { // Second check (with locking)
                    singleton = new SingletonDemo();
                }
            }
        }
        return singleton;
    }

    /**
     * DEFENSE AGAINST SERIALIZATION: 
     * This method is automatically called during deserialization to return the existing instance.
     */
    protected Object readResolve() {
        return getSingleTonInstance();
    }

    /**
     * DEFENSE AGAINST CLONING:
     * Override clone() to explicitly prevent duplication.
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Option 1: Return the same instance
        // return getSingleTonInstance();
        
        // Option 2: Strictly prohibit cloning
        throw new CloneNotSupportedException("Cloning of this singleton is not allowed.");
    }
}

/**
 * Main execution class to demonstrate breaking and defending the Singleton pattern.
 */
public class SingletonDesign {
    public static void main(String[] args) {
        
        // 1. Standard Usage
        SingletonDemo baseInstance = SingletonDemo.getSingleTonInstance();
        System.out.println("Original Instance HashCode: " + baseInstance.hashCode());

        // 2. BREAKING VIA REFLECTION
        try {
            Constructor<?>[] constructors = SingletonDemo.class.getDeclaredConstructors();
            for (Constructor<?> cons : constructors) {
                cons.setAccessible(true);
                // This line will throw a RuntimeException due to our defense mechanism
                SingletonDemo reflectionInstance = (SingletonDemo) cons.newInstance();
                System.out.println("Reflection Instance HashCode: " + reflectionInstance.hashCode());
            }
        } catch (Exception e) {
            System.out.println("Reflection Attack Blocked: " + e.getCause().getMessage());
        }

        // 3. BREAKING VIA SERIALIZATION
        try {
            // Serialize the singleton instance to a file
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.obj"));
            oos.writeObject(baseInstance);
            oos.close();

            // Deserialize the singleton instance from the file
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.obj"));
            SingletonDemo serializedInstance = (SingletonDemo) ois.readObject();
            ois.close();

            System.out.println("Deserialized Instance HashCode: " + serializedInstance.hashCode());
            System.out.println("Serialization Check (Should be true): " + (baseInstance == serializedInstance));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 4. BREAKING VIA CLONING
        try {
            // This line will trigger a CloneNotSupportedException due to our defense mechanism
            SingletonDemo clonedInstance = (SingletonDemo) baseInstance.clone();
            System.out.println("Cloned Instance HashCode: " + clonedInstance.hashCode());
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning Attack Blocked: " + e.getMessage());
        }
    }
}
