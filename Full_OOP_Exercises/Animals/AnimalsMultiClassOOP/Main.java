package Full_OOP_Exercises.Animals.AnimalsMultiClassOOP;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Misty");
        Animal bird = new Bird("Tweety");

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

        dog.eat();
        cat.eat();
        bird.eat();

        ((Dog) dog).fetch();
        ((Cat) cat).scratch();
        ((Bird) bird).fly();
    }
}
