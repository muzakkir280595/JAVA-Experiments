package Full_OOP_Exercises.Animals.AnimalsMultiClassOOP;

public class Dog extends Animal{
    
    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof woof!");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching the ball.");
    }     


}
