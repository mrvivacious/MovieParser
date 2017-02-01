package wordBuddies_vbhook2.CS126;

/**
 * Created by vbhook2
 */

/**
 * This class is a constructor for the movies we will parse from the json file
 */
public class MovieObject {
    //desired attributes to collect from json
    private String title;
    private double vote_average;
    private double popularity;
    private int[] genre_ids;

    /**
     * Gets title
     * @return String title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets vote_average (like, a rating)
     * @return Double vote_average
     */
    public double getVote_average() {
        return vote_average;
    }

    /**
     * Gets popularity
     * @return Double popularity
     */
    public double getPopularity() {
        return popularity;
    }

    /**
     * Gets the genres which the movie belongs to
     * @return Array of integers genre_ids
     */
    public int[] getGenre_ids() {
        return genre_ids;
    }
}
