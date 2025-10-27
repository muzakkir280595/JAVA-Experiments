package zoo;

// Superclass
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass
class Dog extends Animal {
    // This method overrides the makeSound() method of the superclass
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class Zoo {
    public static void main(String[] args) {
        // Here we create objects of type Dog and Cat, but refer to them as Animal
        Animal myDog = new Dog(); 
        Animal myCat = new Cat();

        // At runtime, the JVM knows the actual object type and calls the correct method
        myDog.makeSound(); // Output: The dog barks.
        myCat.makeSound(); // Output: The cat meows.
    }
}