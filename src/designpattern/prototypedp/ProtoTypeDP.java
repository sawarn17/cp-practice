package designpattern.prototypedp;

public class ProtoTypeDP {

    /*
     * Implementation of Prototype DP
     * Genrally we are useing either interface or abstract classes
     * 
     * 
     * USED WHEN :
     * - Object Creation logic is very complex
     * -
     */

    public static void main(String[] args) {
        // Create original objects
        Circle originalCircle = new Circle(10);
        Rectangle originalRectangle = new Rectangle(20, 30);

        // Clone the objects
        Circle clonedCircle = originalCircle.clone();
        Rectangle clonedRectangle = originalRectangle.clone();

        // Display original and cloned objects
        System.out.println("Original Circle: " + originalCircle);
        System.out.println("Cloned Circle: " + clonedCircle);

        System.out.println("Original Rectangle: " + originalRectangle);
        System.out.println("Cloned Rectangle: " + clonedRectangle);

        // Modify the clone and see the changes
        clonedCircle.setRadius(15);
        clonedRectangle.setWidth(25);

        System.out.println("\n\nAfter modifying cloned objects:");
        System.out.println("Original Circle: " + originalCircle);
        System.out.println("Cloned Circle: " + clonedCircle);

        System.out.println("Original Rectangle: " + originalRectangle);
        System.out.println("Cloned Rectangle: " + clonedRectangle);
    }
}
