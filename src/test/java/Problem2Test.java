import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        assertTrue(true);
        // add your tests here
        // unsorted Int arrays for testing
        int[] testing0 = {5,3,4,1};
        int[] testing0Key = {1,3,4,5};

        int[] testing1 = {5,6,3,4,7,8,9};
        int[] testing1Key = {3,4,5,6,7,8,9};

        //calling the static method of the bubbleSort class to sort the array
        Problem2.bubbleSort(testing0);
        for(int i = 0; i < testing0.length; ++i){
            System.out.println(testing0[i]);}
        Problem2.bubbleSort(testing1);

        assertArrayEquals(testing0, testing0Key);
        assertArrayEquals(testing1,testing1Key);


    }
}
