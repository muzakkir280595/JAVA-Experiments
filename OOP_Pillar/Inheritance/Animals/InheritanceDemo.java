package OOP_Pillar.Inheritance.Animals;

public class InheritanceDemo {
    public static void main(String[] args) {
        
        // Create an object of the subclass (Dog)
        Dog myDog = new Dog("Buddy"); 

        // 1. Access inherited field:
        System.out.println("My dog's name is: " + myDog.name); // Output: My dog's name is: Buddy

        // 2. Call inherited methods from Animal:
        myDog.eat();    // Output: Buddy is eating.
        myDog.sleep();  // Output: Buddy is sleeping.

        // 3. Call its own unique method:
        myDog.bark();   // Output: Buddy is barking.
    }
}
