import java.util.ArrayList;
import java.util.Scanner;

/*
Go to repl.it and implement  a class called Movie  with the following attributes:

        Title, Year, Director, Duration, Actors, Genre, Rating

        Create the appropriate methods:
        You should include a method that prints all the movie details.

        -----------------------------------------

        In main create an array of  4 Movies.  Create instances of 4 movies and  enter all relevant information from the
         keyboard. The rating for each movie should be randomly generated on a scale of 1 to 10.  Keep track of the
         movie with the highest rating and the movie with the lowest rating.  Iterate the array and print the title and
         rating of all movies in the array of movies. Then print the title of the movie with the highest and lowest rating.

        When you are finished share your repl url with me.
*/

public class Main {

    public static void main(String[] args) {
        ArrayList<Movie> library = new ArrayList<>();
        System.out.println("Provide number of movies to enter in library: ");
        Scanner sc = new Scanner(System.in);
        autoEnterMovie(library,sc);

        System.out.println("Movie library: ");
        for (Movie movie : library) {
            movie.print();
        }
        System.out.println("Top rated movie: ");
        System.out.println(getTopRated(library));
        System.out.println("Bottom rated movie: ");
        System.out.println(getBottomRated(library));
    }
    public static void autoEnterMovie(ArrayList<Movie> library, Scanner sc) {

        System.out.println("Enter number of movies to generate: ");
        int numMovies = Integer.parseInt(sc.nextLine());
        for (int i=0; i<numMovies; ++i) {
            int n = i + 1;
            Movie newMovie = new Movie(
                    "title " + n, 1980, "director " + n,
                    90, "actors " + n, "genre " + n);
            library.add(newMovie);
        }
    }

    public static String getTopRated(ArrayList<Movie> library) {
        Movie topRatedMovie = library.get(0);
        int topRating = 0;
        for (int i = 1; i < library.size(); ++i) {
            Movie indexedMovie = library.get(i);
            int rating = indexedMovie.getRating();
            if (rating > topRating) {
                topRating = rating;
                topRatedMovie = indexedMovie;
            }
        }
        return topRatedMovie.getTitle();
    }
    public static String getBottomRated(ArrayList<Movie> library) {
        Movie bottomRatedMovie = library.get(0);
        int bottomRating = 11;
        for (int i = 1; i < library.size(); ++i) {
            Movie indexedMovie = library.get(i);
            int rating = indexedMovie.getRating();
            if (rating < bottomRating) {
                bottomRating = rating;
                bottomRatedMovie = indexedMovie;
            }
        }
        return bottomRatedMovie.getTitle();
    }
}