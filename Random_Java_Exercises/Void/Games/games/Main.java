package Random_Java_Exercises.Void.Games.games;

public class Main {
    public static void main(String[] args) {
    
        VideoGames myGame = new VideoGames("Cyberpunk 2077", "PC");

        System.out.println("**Calling inherited and overridden methods:**");
        
    
        myGame.startGame(); 

    
        myGame.displayGameType(); 


        myGame.loadLevel();
    }
}
