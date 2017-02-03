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
     * Prints all movies
     * @param results
     * @return String list of all movie titles on separate lines
     */
    public static String allMovies( MovieObject[] results ) {
        String list = "";
        for( int index = 0; index < results.length; index++ ) {
            list += (results[index].getTitle()  + "\n");
        }
        return list;
    }

    /**
     * Prints movies from a selected genre
     * @param results
     * @param genre
     * @return String list of genre-specific movies on separate lines
     */
    public static String genre( MovieObject[] results, int genre ) {
        String list = "";
        System.out.println();
        for( int index = 0; index < results.length; index++ ) {
            int[] genreList = results[index].getGenre_ids();
            for( int IDnum = 0; IDnum < genreList.length; IDnum++ ) {
                if (genreList[IDnum] == genre) {
                    list += (results[index].getTitle() + "\n");
                }
            }
        }
        return list;
    }

    /**
     * Prints movies above a specified vote count
     * @param results
     * @param threshold
     * @return String list of movies exceeding a specified vote on separate lines
     */
    public static String exceedVotes( MovieObject[] results, double threshold ) {
        String list = "";
        System.out.print( "\nMovies above your specified vote:\n\n" );
        for( int index = 0; index < results.length; index++ ) {
            if( results[index].getVote_average() > threshold ) {
                list += ( results[index].getTitle() + "\n");
            }
        }
        return list;
    }

    /**
     * Prints movies above a specified popularity level
     * @param results
     * @param pop
     * @return String list of movies exceeding a specified popularity on separate lines
     */
    public static String exceedPop( MovieObject[] results, double pop ) {
        String list = "";
        System.out.println( "\nMovies above your specified popularity:\n" );
        for( int index = 0; index < results.length; index++ ) {
            if( results[index].getPopularity() > pop ) {
                list += ( results[index].getTitle() + "\n");
            }
        }
        return list;
    }
}
