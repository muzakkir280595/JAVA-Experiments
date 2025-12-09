package OOP_Pillar.CHATGPT_STUDY.polymorphism;

public class cat extends animal{

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }

    void scratch() {
        System.out.println("Cat scratches the couch.");
    }
}
