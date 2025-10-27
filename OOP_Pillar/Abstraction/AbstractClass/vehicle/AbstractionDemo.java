package OOP_Pillar.Abstraction.AbstractClass.vehicle;

// Abstract Class
abstract class Vehicle {
    String brand = "Generic Vehicle";

    // 1. Abstract method (no body)
    // Subclasses MUST implement this.
    abstract void startEngine();

    // 2. Concrete method (with body)
    // Shared functionality for all vehicles.
    public void stop() {
        System.out.println(brand + " has stopped.");
    }
}

// Subclass inheriting from the abstract class
class Car extends Vehicle {

    // Constructor to set the brand
    public Car() {
        this.brand = "Toyota";
    }

    // Implementation of the abstract method
    @Override
    void startEngine() {
        System.out.println("Car started with a key ignition.");
    }
}

// Another subclass
class Motorcycle extends Vehicle {

    public Motorcycle() {
        this.brand = "Honda";
    }

    // Implementation of the abstract method
    @Override
    void startEngine() {
        System.out.println("Motorcycle started with a kick-starter.");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        // We can't create an object of Vehicle: Vehicle myVehicle = new Vehicle(); // Error!

        // We create objects of the concrete subclasses
        Car myCar = new Car();
        Motorcycle myMotorcycle = new Motorcycle();

        // Calling the methods
        myCar.startEngine(); // Hides the complexity of *how* the car starts
        myCar.stop();        // Uses the concrete method from the abstract class

        myMotorcycle.startEngine(); // Hides the complexity of *how* the motorcycle starts
        myMotorcycle.stop();
    }
}