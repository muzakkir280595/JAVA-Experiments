package OOP_Pillar.CHATGPT_STUDY.polymorphism;

public class mainOverriding {

    public static void main(String[] args) {
        
        animalSound sound = new animalSound();

        
        animal a1 = new dog();
        animal a2 = new cat();
        animal a3 = new bird();

        a1.makeSound();  // Woof!
        a2.makeSound();  // Meow!
        a3.makeSound();  // Tweet!

    }
}
