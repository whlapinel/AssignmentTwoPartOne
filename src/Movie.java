import java.util.Scanner;

public class Movie {
    private String title;
    private int year;
    private String director;
    private int duration;
    private String actors;
    private String genre;
    private int rating;

    public Movie() {

    }

    public void generateRating() {
        this.rating = (int) (Math.random() * 10) + 1;
    }
    public void userEnterMovie() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Title: ");
        this.title = sc.nextLine();
        System.out.println("Year: ");
        this.year = Integer.parseInt(sc.nextLine());
        System.out.println("Director: ");
        this.director = sc.nextLine();
        System.out.println("Duration in minutes: ");
        this.duration = Integer.parseInt(sc.nextLine());
        System.out.println("Actors: ");
        this.actors = sc.nextLine();
        System.out.println("Genre: ");
        this.genre = sc.nextLine();
        this.generateRating();
    }

    public void print() {
        System.out.print("title: " + this.title + " | ");
        System.out.print("year: " + this.year + " | ");
        System.out.print("director: " + this.director + " | ");
        System.out.print("duration: " + this.duration + " min | ");
        System.out.print("actors: " + this.actors + " | ");
        System.out.print("genre: " + this.genre + " | ");
        System.out.print("rating: " + this.rating + " | ");
        System.out.println();
    }
    public int getRating() {
        return rating;
    }

}
