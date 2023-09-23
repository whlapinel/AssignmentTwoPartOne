
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
        Library library = new Library();
        for (int i = 0; i < 4; ++i) {
            Movie movie = new Movie();
            System.out.println("Enter information for movie #" + (i + 1));
            movie.userEnterMovie();
            library.addMovie(movie);
        }
        System.out.println("Complete movie library:");
        library.print();
        Movie topMovie = library.getTopRated();
        Movie bottomMovie = library.getBottomRated();
        System.out.println("Top Rated Movie:");
        topMovie.print();
        System.out.println("Bottom Rated Movie");
        bottomMovie.print();
    }
}