package Full_OOP_Exercises.Movies.movieSystem;

import java.util.ArrayList;

public class movieList {
    
    public static void main(String[] args) {

        ArrayList<movie> movieCollection = new ArrayList<>();
        
        
        movie movie1 = new movie("Inception", "Sci-Fi", 2010, 8.8);
        movie movie2 = new movie("The Shawshank Redemption", "Drama", 1994, 9.3);
        movie movie3 = new movie("Parasite", "Thriller", 2019, 8.5);
        
    
        movieCollection.add(movie1);
        movieCollection.add(movie2);
        movieCollection.add(movie3);
        

        System.out.println("--- Movie Collection Status ---");
        System.out.println("Total Movies in List: " + movieCollection.size());
        
        System.out.println("\nFirst Movie (Index 0):");

        System.out.println(movieCollection.get(0)); 
        

        System.out.println("\n--- Full Movie List ---");
        for (movie movie : movieCollection) {
            System.out.println(movie);
        }
        
        System.out.println("\n--- Movies by Genre: Sci-Fi ---");
        for (movie movie : movieCollection) {
            if (movie.getGenre().equals("Sci-Fi")) {
                System.out.println(movie.getTitle() + " (" + movie.getReleaseYear() + ")");
            }
        }
        
        movieCollection.remove(1); // Removing "The Shawshank Redemption"
        
        System.out.println("\n--- List After Removal ---");
        System.out.println("Total Movies in List: " + movieCollection.size());
        for (movie movie : movieCollection) {
            System.out.println(movie.getTitle());
        }
    }
}
