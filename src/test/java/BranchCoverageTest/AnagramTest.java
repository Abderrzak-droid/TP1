package BranchCoverageTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.src.Anagram;
import org.src.AnagramModified;

public class AnagramTest {

    @Test
    void shouldReturnFalseIfTheLengthOfTheTwoWordsIsDifferent(){

        Assertions.assertFalse(Anagram.isAnagram("chien","nich"));
    }

    @Test
    void shouldReturnTrueIfAllTheCountersAreEqualToZero(){

        Assertions.assertTrue(AnagramModified.isAnagram("chien","niche"));
    }

    @Test
    void shouldReturnExceptionIfTheStringISNull(){
        String s = null;
        Assertions.assertThrows(NullPointerException.class,()-> Anagram.isAnagram(s," "));
    }

    @Test
    void shouldReturnFalseIfOneOfTheLetterCountersIsDifferentThanZero(){

        Assertions.assertFalse(Anagram.isAnagram("niche","riche"));
    }
}
