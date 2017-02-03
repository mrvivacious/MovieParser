package wordBuddies_vbhook2.CS126;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by vbhook2
 */
//?? add test cases for successes. add test cases for invalid inputs. figure out how to deal with invalid inputs
public class MovieCollectionTest {

    /**
     * Confirm that all movies were printed
     * @throws Exception
     */
    @Test
    public void allMovies() throws Exception {
            String fullList = "The Secret Life of Pets\n" +
                    "Suicide Squad\n" +
                    "La La Land\n" +
                    "Assassin's Creed\n" +
                    "Finding Dory\n" +
                    "Jurassic World\n" +
                    "Moana\n" +
                    "Miss Peregrine's Home for Peculiar Children\n" +
                    "Fantastic Beasts and Where to Find Them\n" +
                    "Interstellar\n" +
                    "xXx: Return of Xander Cage\n" +
                    "Captain America: Civil War\n" +
                    "Mad Max: Fury Road\n" +
                    "Arrival\n" +
                    "Passengers\n" +
                    "Split\n" +
                    "The Magnificent Seven\n" +
                    "Inferno\n" +
                    "The Girl on the Train\n" +
                    "Underworld: Blood Wars\n";

            assertEquals(fullList, MovieCollection.allMovies(MovieParser.movieList));
    }

    /**
     * Confirm accuracy of genre requests
     * @throws Exception
     */
    @Test
    public void genre() throws Exception {
        String action = "Suicide Squad\n" +
                "Assassin's Creed\n" +
                "Jurassic World\n" +
                "xXx: Return of Xander Cage\n" +
                "Captain America: Civil War\n" +
                "Mad Max: Fury Road\n" +
                "The Magnificent Seven\n" +
                "Inferno\n" +
                "Underworld: Blood Wars\n";

        String comedy = "The Secret Life of Pets\n" +
                "La La Land\n" +
                "Moana\n";

        assertEquals(action, MovieCollection.genre(MovieParser.movieList, 28));
        assertEquals(comedy, MovieCollection.genre(MovieParser.movieList, 35));

    }

    /**
     * Confirm accuracy of vote requests
     * @throws Exception
     */
    @Test
    public void exceedVotes() throws Exception {
        String sixPtSeven = "La La Land\n" +
                "Fantastic Beasts and Where to Find Them\n" +
                "Interstellar\n" +
                "Captain America: Civil War\n" +
                "Mad Max: Fury Road\n";

        String eight = "La La Land\n";

        assertEquals(sixPtSeven, MovieCollection.exceedVotes(MovieParser.movieList,6.7));
        assertEquals(eight, MovieCollection.exceedVotes(MovieParser.movieList,8));
    }

    /**
     * Confirm accuracy of popularity requests
     * @throws Exception
     */
    @Test
    public void exceedPop() throws Exception {
        String fifty = "The Secret Life of Pets\n" +
                "Suicide Squad\n" +
                "La La Land\n" +
                "Assassin's Creed\n" +
                "Finding Dory\n" +
                "Jurassic World\n" +
                "Moana\n" +
                "Miss Peregrine's Home for Peculiar Children\n" +
                "Fantastic Beasts and Where to Find Them\n";

        String oneFifty =
                "The Secret Life of Pets\n" +
                "Suicide Squad\n";

        assertEquals(fifty, MovieCollection.exceedPop(MovieParser.movieList,50));
        assertEquals(oneFifty, MovieCollection.exceedPop(MovieParser.movieList,150));

    }

    /**
     * Input strings when prompted for genre ID or popularity vote request
     * print error messages then prompt proper input
     * test to make sure prompt is correctly executed in these situations
     *
     * How to treat a String as an integer, though? TextIO?
     * @throws Exception
     */
    @Test
    public void invalidInputs() throws Exception {

    }
}