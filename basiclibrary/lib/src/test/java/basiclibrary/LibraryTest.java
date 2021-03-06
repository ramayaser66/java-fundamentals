/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {

    @Test public void testRoll() {
        int [] rollResult = Library.roll(4);
        assertEquals("Number of roll", 4, rollResult.length);
    }

    @Test public void testContainsDuplicates() {
        int [] arr ={1,2,3,4,5,6,8,2,1};
        assertTrue("Contains Duplicates ",Library.containsDuplicates(arr));
    }

    @Test public void testCalcAverage() {
        int [] arr ={10,29,37,4,85};
        assertTrue("the average is  ",Library.calcAverage(arr) ==33.0);
    }

    @Test public void testArrayOfArrays() {
        int[][] weeklyMonthTemperatures = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
          };

          int [] arr = weeklyMonthTemperatures[2];
          int [] newArr = Library.arrayOfArrays(weeklyMonthTemperatures);
        assertArrayEquals("lowest avg array",arr, newArr);
    }




}
