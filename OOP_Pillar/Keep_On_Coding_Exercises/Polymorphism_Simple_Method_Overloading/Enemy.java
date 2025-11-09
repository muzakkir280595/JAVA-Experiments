package OOP_Pillar.Keep_On_Coding_Exercises.Polymorphism_Simple_Method_Overloading;

public class Enemy {

    // Basic method
    public void talk() {
        System.out.println("I am an enemy! You better RUN!!!");
    }

    // Overloaded method 1 — adds enemy name
    public void talk(String name) {
        System.out.println("I am " + name + ", I'm GONNA SUCK YOUR BLOOD!!!");
    }

    // Overloaded method 2 — adds health
    public void talk(int health) {
        System.out.println("I am an enemy with " + health + " HP! You better RUN!!!");
    }

    // Overloaded method 3 — adds both name and health
    public void talk(String name, int health) {
        System.out.println("I am " + name + " with " + health + " HP! You better RUN!!!");
    }

}
