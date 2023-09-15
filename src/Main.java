import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Movie> library = new ArrayList<>();
        System.out.println("Provide number of movies to enter in library: ");
        Scanner sc = new Scanner(System.in);
        autoEnterMovie(library,sc);
/*        int runtimes = Integer.parseInt(sc.nextLine());
        for (int x=0; x<runtimes; ++x) {
            Movie newMovie = UserEnterMovie(sc);
            library.add(newMovie);
            for (Movie movie : library) {
                movie.print();
            }
        }*/
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
            Movie newMovie = new Movie(
                    "title" + i, 1980, "director" + i,
                    90, "actors" + i, "genre" + i);
            library.add(newMovie);
        }
    }
/*    public static Movie UserEnterMovie(Scanner sc) {
        System.out.println("Please enter movie information as follows.");
        System.out.println("Enter title: ");
        String title = sc.nextLine();
        System.out.println("Enter director: ");
        String director = sc.nextLine();
        System.out.println("Enter actors: ");
        String actors = sc.nextLine();
        System.out.println("Enter genre: ");
        String genre = sc.nextLine();
        System.out.println("Enter duration: ");
        int duration = Integer.parseInt(sc.nextLine());
        System.out.println("Enter year: ");
        int year = Integer.parseInt(sc.nextLine());
        return new Movie(title, year, director, duration, actors, genre);
    }*/

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