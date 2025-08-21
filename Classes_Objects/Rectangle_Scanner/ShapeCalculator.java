package Rectangle_Scanner;

//ShapeCalculator.java
import java.util.Scanner;

public class ShapeCalculator {
 public static void main(String[] args) {
     // Create a Scanner object to read user input
     Scanner scanner = new Scanner(System.in);
     
     // Prompt the user for the rectangle's width
     System.out.print("Enter the width of the rectangle: ");
     double widthInput = scanner.nextDouble();
     
     // Prompt the user for the rectangle's height
     System.out.print("Enter the height of the rectangle: ");
     double heightInput = scanner.nextDouble();
     
     // Create a new Rectangle object
     Rectangle myRectangle = new Rectangle();
     
     // Set the object's properties using the user input
     myRectangle.width = widthInput;
     myRectangle.height = heightInput;
     
     // Calculate and display the area
     double area = myRectangle.getArea();
     System.out.println("The area of the rectangle is: " + area);
     
     // Close the scanner
     scanner.close();
 }
}
