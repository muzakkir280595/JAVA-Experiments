package OOP_Pillar.Keep_On_Coding_Exercises.Polymorphism_Simple_Method_Overriding;

class MainArrayPolymorphism {

    public static void main(String[] args) {

        Vampire vampire = new Vampire();
        Werewolf werewolf = new Werewolf();
        
    Enemy [] enemies = {vampire, werewolf};

    enemies[0].talk();
    enemies[1].talk();

    }

}
