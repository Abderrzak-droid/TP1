package LineCoverageTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.src.BinarySearch;
import org.src.BinarySearchModified;

public class BinarySearchTest {

    @Test
    void shouldReturnTheIndexOfTheElement(){
        int[] tab = {1,2,3,4,5,};
        Assertions.assertEquals(1, BinarySearch.binarySearch(tab,2));
    }

    @Test
    void shouldReturnTheIndexOfTheElementWithTheModifiedFunction(){
        int[] tab = {1,2,3,4,5,};
        Assertions.assertEquals(1, BinarySearchModified.binarySearch(tab,2));
    }

    @Test
    void shouldReturnExceptionIfTheArrayIsNull(){
        int[] tab = null;
        Assertions.assertThrows(NullPointerException.class,()-> BinarySearch.binarySearch(tab,1));
    }

    @Test
    void shouldReturnNegativeIndexIfTheElementDoesntExistInTheArray(){
        int[] tab = {1,2,3,4,5};
        Assertions.assertEquals(-1,BinarySearch.binarySearch(tab,6));
    }


}
