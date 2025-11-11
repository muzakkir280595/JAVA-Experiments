package Full_OOP_Exercises.Animals.AnimalsMultiClassOOP;

public class Cat extends Animal{

public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow Meow!");
    }

    public void scratch() {
        System.out.println(getName() + " is scratching the sofa.");
    }     


}
