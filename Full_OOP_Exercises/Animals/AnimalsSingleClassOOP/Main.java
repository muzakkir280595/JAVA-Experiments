package Full_OOP_Exercises.Animals.AnimalsSingleClassOOP;

//This is full OOP exercise with single main class file. Soon will be split into multiple files by naming Main class as Runner.

// Base class (Parent)
abstract class Animal {
    // Encapsulated field (private)
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter (encapsulation)
    public String getName() {
        return name;
    }

    // Abstract method (must be implemented by subclasses)
    public abstract void makeSound();

    // Common method
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Subclass 1
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof woof!");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching the ball!");
    }
}

// Subclass 2
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }

    public void scratch() {
        System.out.println(getName() + " is scratching the sofa!");
    }
}

// Subclass 3
class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Chirp chirp!");
    }

    public void fly() {
        System.out.println(getName() + " is flying!");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Misty");
        Animal bird = new Bird("Tweety");

        // Polymorphism: same method call, different behavior
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

        // Common method from base class
        dog.eat();
        cat.eat();
        bird.eat();

        // Downcasting to access subclass-specific methods
        ((Dog) dog).fetch();
        ((Cat) cat).scratch();
        ((Bird) bird).fly();
    }
}
