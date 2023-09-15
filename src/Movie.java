public class Movie {
    private String title;
    private int year;
    private String director;
    private int duration;
    private String actors;
    private String genre;
    private int rating;

    public Movie(String title, int year, String director, int duration, String actors, String genre) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.duration = duration;
        this.actors = actors;
        this.genre = genre;
        this.rating = (int) (Math.random() * 10);
    }

    public void print() {
        System.out.println("**********************************");
        System.out.println("information about: " + this.title);
        System.out.println("**********************************");
        System.out.println("title: " + this.title);
        System.out.println("year: " + this.year);
        System.out.println("director: " + this.director);
        System.out.println("duration: " + this.duration);
        System.out.println("actors: " + this.actors);
        System.out.println("genre: " + this.genre);
        System.out.println("rating: " + this.rating);
        System.out.println("**********************************");
    }
}
