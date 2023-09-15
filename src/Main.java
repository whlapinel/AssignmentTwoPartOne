import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter title: ");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        Movie newMovie = new Movie(title);
        newMovie.print();
    }
}