package Random_Java_Exercises.Void.Games.games;

public class VideoGames extends Game{

private String platform;

public VideoGames(String title, String platform){

    super(title);
    this.platform=platform;
}

public void loadLevel() {
        System.out.println("Loading level 1 on " + platform + ".");
    }

@Override
    public void displayGameType() {
        System.out.println("This is a specific type of game: a Video Game played on " + platform + ".");
    }

}
