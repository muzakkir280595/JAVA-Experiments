package OOP_Pillar.Keep_On_Coding_Exercises.Encapsulation;

public class Enemy {

    //public int health; //for learning purposes, we are keeping it public

    private int health; //for learning purposes, we are keeping it private

    public void getHealth() {
        System.out.println(health);
    }

    
    public void setHealth(int x) {
        health = x;
    }

}
