package Online_Store_Scanner_If_Else;

//Order.java
public class Order {
 // Properties
 String productName;
 double price;
 int quantity;

 // Method with if-else
 public double calculateTotal() {
     double subtotal = price * quantity;
     
     // Check if the order qualifies for a discount
     if (subtotal > 100.0) {
         System.out.println("Congratulations! You've received a 10% discount on your order.");
         return subtotal * 0.90; // Apply 10% discount
     } else {
         return subtotal; // No discount
     }
 }
}
