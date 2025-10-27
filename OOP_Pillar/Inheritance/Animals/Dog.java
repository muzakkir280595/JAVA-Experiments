package OOP_Pillar.Inheritance.Animals;

// Subclass (Child Class)
class Dog extends Animal {
    
    // The Dog class implicitly has the 'name' field, 'eat()' and 'sleep()' methods.

    public Dog(String name) {
        // Calls the constructor of the superclass (Animal)
        super(name); 
    }

    // New method specific to Dog
    public void bark() {
        System.out.println(name + " is barking.");
    }
}
