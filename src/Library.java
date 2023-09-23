import java.util.ArrayList;

public class Library {
    private ArrayList<Movie> movies;

    public Library() {
        movies = new ArrayList<Movie>();
    }
    public void addMovie(Movie movie) {
        movies.add(movie);
    }
    public Movie getTopRated() {
        Movie topRatedMovie = movies.get(0);
        int topRating = 0;
        for (int i = 0; i < movies.size(); ++i) {
            Movie indexedMovie = movies.get(i);
            int rating = indexedMovie.getRating();
            if (rating > topRating) {
                topRating = rating;
                topRatedMovie = indexedMovie;
            }
        }
        return topRatedMovie;
    }
    public Movie getBottomRated() {
        Movie bottomRatedMovie = movies.get(0);
        int bottomRating = 11;
        for (int i = 0; i < movies.size(); ++i) {
            Movie indexedMovie = movies.get(i);
            int rating = indexedMovie.getRating();
            if (rating < bottomRating) {
                bottomRating = rating;
                bottomRatedMovie = indexedMovie;
            }
        }
        return bottomRatedMovie;
    }
    public void print() {
        for (int i = 0; i < movies.size(); ++i) {
            movies.get(i).print();
        }
    }
}
