package OOP_Pillar.CHATGPT_STUDY.polymorphism;

public class bird extends animal{

    @Override
    void makeSound() {
        System.out.println("Tweet!");
    }

    void fly() {
        System.out.println("Bird flies high in the sky.");
    }
}
