package java8.comparabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//need to implement the Comparable<ClassType>
class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override // this method is responsible to the comparing of two methods
    public int compareTo(Student other) {

        // Null safety check
        if (other == null) {
            throw new NullPointerException("Cannot compare with null");
        }

        // Safe comparison (avoids integer overflow)
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return id + "-" + name;
    }
}

public class ComparableExample {

    /*
    The Comparable interface in Java is used to define the natural ordering of objects of a class. 
    It enables objects to be compared and sorted automatically without using an external Comparator.
    It contains the compareTo() method, which compares the current object with another object.

    **Although it satisfies the structural requirements of a Single Abstract Method (SAM) interface, it is virtually never treated or used as a functional interface in real-world application

    The Structural Match: 
        Comparable<T> contains exactly one abstract method: int compareTo(T o). 
        Technically, this qualifies it as a functional interface under the Java Specification.

    -----------------------------------------------------------------------------------------------
    compareTo() Return Values
        Returns a negative value if the current object is smaller than the specified object.
        Returns 0 if both objects are equal.
        Returns a positive value if the current object is greater than the specified object.


    ------------------------------------------------------------------------------------------------
    Advantages of Comparable Interface
        Defines the natural ordering of objects automatically.
        Eliminates the need for a separate Comparator class for simple sorting.
        Makes sorting custom objects easier and more efficient.
        Provides consistent ordering in collections like TreeSet and TreeMap.
        Improves code maintainability by keeping sorting logic inside the class.
        Widely used in Java Collection Framework for object comparison and sorting.
    
    
    */

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        Collections.sort(students);

        System.out.println(students);
    }
}
