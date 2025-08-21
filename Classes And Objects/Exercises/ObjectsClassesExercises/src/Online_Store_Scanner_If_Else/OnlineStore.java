package Online_Store_Scanner_If_Else;

//OnlineStore.java
import java.util.Scanner;

public class OnlineStore {
 public static void main(String[] args) {
     // Create a Scanner object for user input
     Scanner scanner = new Scanner(System.in);

     // Prompt user for product details
     System.out.print("Enter product name: ");
     String nameInput = scanner.nextLine();
     
     System.out.print("Enter product price: $");
     double priceInput = scanner.nextDouble();
     
     System.out.print("Enter quantity: ");
     int quantityInput = scanner.nextInt();

     // Create a new Order object
     Order myOrder = new Order();
     
     // Set the object's properties with user input
     myOrder.productName = nameInput;
     myOrder.price = priceInput;
     myOrder.quantity = quantityInput;

     // Calculate and display the final total using the object's method
     double finalTotal = myOrder.calculateTotal();
     System.out.println("Your total for " + myOrder.quantity + "x " + myOrder.productName + " is: $" + String.format("%.2f", finalTotal));
     
     // Close the scanner
     scanner.close();
 }
}
