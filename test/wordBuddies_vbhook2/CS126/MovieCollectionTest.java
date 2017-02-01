package wordBuddies_vbhook2.CS126;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by vbhook2
 */
//?? add test cases for successes. add test cases for invalid inputs. figure out how to deal with invalid inputs
public class MovieCollectionTest {
    @Test
    public void successAllMovies() throws Exception {
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

    @Test
    public void successGenre() throws Exception {
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

    @Test
    public void exceedVotes() throws Exception {

    }

    @Test
    public void exceedPop() throws Exception {

    }

}