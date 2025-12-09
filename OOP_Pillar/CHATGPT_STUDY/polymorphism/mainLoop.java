package OOP_Pillar.CHATGPT_STUDY.polymorphism;

import Full_OOP_Exercises.Animals.AnimalsMultiClassOOP.Bird;
import Full_OOP_Exercises.Animals.AnimalsMultiClassOOP.Cat;
import OOP_Pillar.CHATGPT_STUDY.inheritance.Dog;

public class mainLoop {

    public static void main(String[] args) {
        animalSound sound = new animalSound();

        animal[] animals = {new dog(), new cat(), new bird()};

        for (animal a : animals){

            a.makeSound();
        }
    }
}
