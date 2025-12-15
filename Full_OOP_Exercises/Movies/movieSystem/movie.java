package Full_OOP_Exercises.Movies.movieSystem;

public class movie {
    
    private String title;
    private String genre;
    private int releaseYear;
    private double rating;

    
    public movie(String title, String genre, int releaseYear, double rating) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Title: " + title + " | Genre: " + genre + 
               " | Year: " + releaseYear + " | Rating: " + rating;
    }
}
