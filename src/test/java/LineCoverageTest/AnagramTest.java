package LineCoverageTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.src.Anagram;
import org.src.AnagramModified;

public class AnagramTest {
    @Test
    void shouldReturnExceptionIfOneOfTheStringsIsNull(){
        String s1 = null;
        String s2 = null;
        Assertions.assertThrows(NullPointerException.class,()-> Anagram.isAnagram(s1,s2));
    }

    @Test
    void shouldReturnFalseIfOneOFTheTwoWordsIsLongerThanTheOther(){
        Assertions.assertEquals(false,Anagram.isAnagram("amam","mamam"));
    }

    @Test
    void shouldReturnFalseIfTheTwoWordsDoesntHaveTheSameLetters(){
        Assertions.assertEquals(false, Anagram.isAnagram("zbcd","zbce"));
    }

    @Test
    void shouldReturnTrueIfTheTwoWordsAreAnagrams(){
        Assertions.assertEquals(true,Anagram.isAnagram("chien","niche"));
    }

}
