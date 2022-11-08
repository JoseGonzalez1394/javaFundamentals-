package basiclibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void rollTheDiceACertainNumberOfTimes() {
        Library arrayToTest = new Library();

        assertEquals(arrayToTest.roll(5).length, 5);
    }

    @Test void checkForDoubles(){
        Library arrayToTest = new Library();
        int[] duplicate = {1,2,3,4,4};
        assertTrue(arrayToTest.containsDuplicates(duplicate));
    }

    @Test void averageCalculator(){
        Library arrayToTest = new Library();
        int[] test1 = {1,2,3,4,5};
        int[] test2 = {1,2,3,4,5,6,7};

        assertEquals(3, arrayToTest.calculateAverage(test1));
        assertEquals(4, arrayToTest.calculateAverage(test2));
    }

    @Test void lowestAverageArray(){
        Library arrayToTest = new Library();
        int[][] array = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7, 8}
        };

        int[] correct = {1, 2, 3, 4, 5};




        assertArrayEquals(correct, arrayToTest.lowestAverageArray(array));

    }
}
