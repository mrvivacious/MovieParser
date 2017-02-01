package wordBuddies_vbhook2.CS126;

/**
 * Created by vbhook2
 */

/**
 * This class is where we sift through our json array for the desired data, then we print the data
 */
public class MovieCollection {
    //necessary for the getResults method, which converts the json data into a usable array
    private MovieObject[] results;

    /**
     * Takes the json data and gives us what is stored under the key "results",
     * which, in this case, is an array of movies
     * @return Array of MovieObjects results
     */
    public MovieObject[] getResults() {
        return results;

    }

    /**
     * Prints titles of all movies
     * @param results
     */
    public static void allMovies( MovieObject[] results ) {
        for( int index = 0; index < results.length; index++ ) {
            System.out.println( results[index].getTitle() );
        }
    }

    /**
     * Prints titls of movies belonging to a specified genre
     * @param results
     * @param genre
     */
    public static void genre( MovieObject[] results, int genre ) {
        System.out.println();
        for( int index = 0; index < results.length; index++ ) {
            int[] genreList = results[index].getGenre_ids();
            for( int IDnum = 0; IDnum < genreList.length; IDnum++ ) {
                if (genreList[IDnum] == genre) {
                    System.out.println(results[index].getTitle());
                }
            }
        }
    }

    /**
     * Prints movies above a specified vote_average value
     * @param results
     * @param threshold
     */
    public static void exceedVotes( MovieObject[] results, double threshold ) {
        System.out.print( "\nMovies above your specified vote:\n" );
        for( int index = 0; index < results.length; index++ ) {
            if( results[index].getVote_average() > threshold ) {
                System.out.println( results[index].getTitle() );
            }
        }
    }

    /**
     * Prints movies above a specified popularity value
     * @param results
     * @param pop
     */
    public static void exceedPop( MovieObject[] results, double pop ) {
        System.out.println( "Movies above your specified popularity:\n" );
        for( int index = 0; index < results.length; index++ ) {
            if( results[index].getPopularity() > pop ) {
                System.out.println( results[index].getTitle() );
            }
        }
    }
}
