package arrayQuestions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PollTest {

    private Poll poll;

    @BeforeEach
    void setUp() {
        poll = new Poll();

    }

    @Test
    void testCalculateAverage() {
        //given
        int[] pollNumbers = {10, 20, 30, 40, 50};
        //when
        poll.calculateAverage(pollNumbers);
        //check
        assertEquals(30, poll.getAverageRatings());

    }

    @Test
    void testCalculateHighestPoints() {
        //given
        int[] pollNumbers = {10, 20, 30, 40, 50};
        //when
        int highestPoint = poll.getHighestPoint(pollNumbers);
        assertEquals(50, highestPoint);
    }

    @Test
    void testCalculateLowestPoints() {
        //given
        int[] pollNumbers = {10, 20, 30, 40, 50};
        //when
        int lowestPoint = poll.getLowestPoint(pollNumbers);
        //assert
        assertEquals(10, lowestPoint);

    }

    //        for (int i = 0; i < getResponses().length; i++) {
//            for(int secondi = 0; secondi < getResponses()[index].lenght;secondi)

}



