package OOP_Pillar.Keep_On_Coding_Exercises.Polymorphism_Simple_Method_Overriding;

class MainEqualPolymorphism {

    public static void main(String[] args) {

        Vampire vampire = new Vampire();
        
        Enemy enemy = vampire;
        enemy.talk();

    }

}
