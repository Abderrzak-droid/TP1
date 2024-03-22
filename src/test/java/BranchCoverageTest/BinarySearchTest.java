package BranchCoverageTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.src.BinarySearch;
import org.src.BinarySearchModified;

public class BinarySearchTest {

    @Test
    void shouldReturnNegativeIndexIfTheLowIsSuperiorToHigh(){
        int[] tab = {1,2,3,4,5};
        Assertions.assertEquals(-1, BinarySearch.binarySearch(tab,6));
    }

    @Test
    void shouldReturnTheIndexIfTheElementOfMidIndexISEqualToElement(){
        int[] tab = {1,2,3,4,5};
        Assertions.assertEquals(1, BinarySearch.binarySearch(tab,2));
    }
    @Test
    void shouldReturnTheIndexIfTheElementOfMidIndexISEqualToElementWithModifiedFunction(){
        int[] tab = {1,2,3,4,5};
        Assertions.assertEquals(1, BinarySearchModified.binarySearch(tab,2));
    }

    @Test
    void shouldReturnExceptionIfArrayIsNull(){
        int[] tab = null;
        Assertions.assertThrows(NullPointerException.class,()->BinarySearch.binarySearch(tab,2));
    }

}
