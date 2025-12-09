package OOP_Pillar.CHATGPT_STUDY.polymorphism;

public class animalSound {

    void makeSound() {
        System.out.println("Some animal sound (generic)");
    }

    void makeSound(String animalName) {
        System.out.println(animalName + " makes a unique sound.");
    }
}
