package OOP_Pillar.CHATGPT_STUDY.polymorphism;

public class dog extends animal{

    @Override
    void makeSound() {
        System.out.println("Woof!");
    }

    void fetch() {
        System.out.println("Dog fetches the ball.");
    }
}
