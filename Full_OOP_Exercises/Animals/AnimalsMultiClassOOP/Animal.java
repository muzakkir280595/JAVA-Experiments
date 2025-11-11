package Full_OOP_Exercises.Animals.AnimalsMultiClassOOP;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

        public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("says: I'm An Alien!");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }   

}
