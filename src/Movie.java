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
        this.rating = (int) (Math.random() * 10) + 1;
    }

    public void print() {
        System.out.print("title: " + this.title + " | ");
        System.out.print("year: " + this.year + " | ");
        System.out.print("director: " + this.director + " | ");
        System.out.print("duration: " + this.duration + " | ");
        System.out.print("actors: " + this.actors + " | ");
        System.out.print("genre: " + this.genre + " | ");
        System.out.print("rating: " + this.rating + " | ");
        System.out.println();
    }
    public int getRating() {
        return rating;
    }
    public String getTitle() {
        return title;
    }
}
