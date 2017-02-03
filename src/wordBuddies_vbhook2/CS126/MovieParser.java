package wordBuddies_vbhook2.CS126;

/**
 * Created by vbhook2
 */

//?? Test cases
import com.google.gson.Gson;
import java.util.Scanner;

/**
 * This class will use gson to extract specified data from a json array of movies
 */
public class MovieParser {
    //static in order to call inside the test file
    public static Gson gson = new Gson();
    public static Scanner scan = new Scanner(System.in);
    public static MovieCollection collector = gson.fromJson(JsonText.Json, MovieCollection.class);
    public static MovieObject[] movieList = collector.getResults();
    public final static String genreList = "The list of all genres, along with their respective IDs:\n" +
            "Action      28\n" +
            "Adventure   12\n" +
            "Animation   16\n" +
            "Comedy      35\n" +
            "Crime       80\n" +
            "Documentary 99\n" +
            "Drama       18\n" +
            "Family      10751\n" +
            "Fantasy     14\n" +
            "History     36\n" +
            "Horror      27\n" +
            "Music       10402\n" +
            "Mystery     9648\n" +
            "Romance     10749\n" +
            "Sci-Fi      878\n" +
            "TV Movie    10770\n" +
            "Thriller    53\n" +
            "War         10752\n" +
            "Western     37.\n";

    /**
     * User will select which list of movies, then main method will call methods from
     * other classes to satisfy the task specified
     * @param args
     */
    public static void main(String[] args) {
        String all = "1";
        String genres = "2";
        String vote = "3";
        String popular = "4";

        //helper function
        welcomeMessage();
        String userInput = scan.nextLine();
        System.out.println();

        while( !userInput.equals(all) && !userInput.equals(genres) && !userInput.equals(vote) && !userInput.equals(popular) ) {
            //helper function
            validInput();
            userInput = scan.nextLine();
            System.out.println();
        }
        //print all movies
        if ( userInput.equals(all) ) {
            System.out.print( MovieCollection.allMovies( movieList ) );
            System.out.println();
        }
        //print genre-specific movies
        if ( userInput.equals(genres) ) {
            System.out.println( genreList );
            System.out.print("Enter the desired genre's ID: ");
            int ID = scan.nextInt();
            System.out.print( MovieCollection.genre( movieList, ID ));
            System.out.println();
        }
        //print movies in relation to a vote number
        if ( userInput.equals(vote) ) {
            //9 because highest in data is 8.1
            System.out.print("Enter a vote between 0.0 and 9.0, inclusive: ");
            double votes = scan.nextDouble();
            System.out.print( MovieCollection.exceedVotes( movieList, validVote(votes) ));
            System.out.println();
        }
        //print movies in relation to a popularity level
        if ( userInput.equals(popular) ) {
            //280 because highest in data is 271
            System.out.print("Enter a value between 0.0 and 280.0, inclusive: ");
            double popularity = scan.nextDouble();
            System.out.print( MovieCollection.exceedPop( movieList, validPop(popularity) ));
            System.out.println();
        }
        System.out.print("Thanks for using my program!");
    }

    /**
     * Helper function
     * Saves space in the main function. Prints out welcoming statements for a great user experience
     */
    public static void welcomeMessage() {
        System.out.println("Welcome to my dope-ass movie gson project!");
        System.out.println("We can print a couple lists of movies, depending on what you're " +
                "looking for!");
        System.out.print("If you want all the movies, enter 1\n" +
                "If you want movies from a certain genre, enter 2\n" +
                "If you want movies exceeding a certain vote, enter 3\n" +
                "If you want movies exceeding a certain popularity, enter 4: ");
    }

    /**
     * Helper function
     * Saves space in the main function. Prints out the prompt should user enter an invalid value
     */
    public static void validInput() {
        System.out.println("Please enter a valid number.");
        System.out.print("If you want all the movies, enter 1\n" +
                "If you want movies from a certain genre, enter 2\n" +
                "If you want movies exceeding a certain vote, enter 3\n" +
                "If you want movies exceeding a certain popularity, enter 4: ");
    }

    /**
     * Confirms that value is inside our parameters, else prompts for a new value
     * @param votes
     * @return
     */
    public static double validVote(double votes) {
        while (votes < 0 || votes > 9) {
            System.out.print("Please enter a vote between 0.0 and 9.0, inclusive: ");
            votes = scan.nextDouble();
        }
        return votes;
    }

    /**
     * Confirms that value is inside our parameters, else prompts for a new value
     * @param popularity
     * @return
     */
    public static double validPop(double popularity) {
        while (popularity < 0 || popularity > 280) {
            System.out.print("Please enter a value between 0.0 and 280.0, inclusive: ");
            popularity = scan.nextDouble();
        }
        return popularity;
    }
}