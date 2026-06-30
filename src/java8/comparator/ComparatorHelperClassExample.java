package java8.comparator;

import java.util.*;

// Define the Student class
class Student {
    String name;
    Integer age;

    // Constructor
    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    // Method to print student details
    @Override
    public String toString() {
        return name + " : " + age;
    }
}

public class ComparatorHelperClassExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ajay", 27));
        students.add(new Student("Sneha", 23));
        students.add(new Student("Simran", 37));

        // Original List
        System.out.println("Original List:");

        // Iterating List
        for (Student it : students) {
            System.out.println(it);
        }

        System.out.println();

        // Sort students by name, then by age
        students.sort(Comparator.comparing(Student::getName).thenComparing(Student::getAge));

        // Display message after sorting
        System.out.println("After Sorting:");

        // Iterating using enhanced for-loop after sorting ArrayList
        for (Student it : students) {
            System.out.println(it);
        }
    }
}
