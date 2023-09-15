import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Movie> library = new ArrayList<>();
        System.out.println("Provide number of movies to enter in library: ");
        Scanner sc = new Scanner(System.in);
        int runtimes = Integer.parseInt(sc.nextLine());
        for (int x=0; x<runtimes; ++x) {
            Movie newMovie = enterMovie(sc);
            library.add(newMovie);
            for (Movie movie : library) {
                movie.print();
            }
        }

    }
    public static Movie enterMovie(Scanner sc) {
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
    }
    public static void getMaxRating() {
        System.out.println("Top rated movie is: "); //FIXME
    }
}