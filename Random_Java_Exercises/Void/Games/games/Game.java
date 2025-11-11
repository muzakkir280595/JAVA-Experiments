package Random_Java_Exercises.Void.Games.games;

public class Game {

    private String title;

    public Game(String title){
        this.title=title;
    }

    public void startGame(){
        System.out.println("The game '" + title + "' is starting up...");
    }

    public void displayGameType() {
        System.out.println("This is a general type of game.");
    }

}
