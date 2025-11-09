package OOP_Pillar.Keep_On_Coding_Exercises.Polymorphism_Simple_Method_Overloading;

class Main {

    public static void main(String[] args) {
        
        Enemy enemy = new Enemy();

        enemy.talk();
        enemy.talk("VAMPIRE");
        enemy.talk(200);
        enemy.talk("VAMPIRE", 200);


    }

}
