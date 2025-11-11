package Full_OOP_Exercises.Animals.AnimalsMultiClassOOP;

public class Bird extends Animal{

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
