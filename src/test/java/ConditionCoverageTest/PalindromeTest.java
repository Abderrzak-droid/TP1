package ConditionCoverageTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.src.Palindrome;

public class PalindromeTest {

    @Test
    void shouldReturnExceptionIfStringIsNull(){
        String s = null;
        Assertions.assertThrows(NullPointerException.class,()-> Palindrome.isPalindrome(s));
    }
    @Test
    void shouldReturnFasleIfiIsInferiorThanjAndCharAtiIsDiffernetnThanCharAtj(){
        String s = "pal";
        Assertions.assertFalse(Palindrome.isPalindrome(s));
    }
    @Test
    void shouldReturnTrueIfiIsGreaterThanjFromTheStart(){
        Assertions.assertEquals(true, Palindrome.isPalindrome("p"));
    }
    @Test
    void shouldReturnTrueIfiIsLessThanjAndAllCaratersAreTheSameFromBothWayes(){
        Assertions.assertEquals(true, Palindrome.isPalindrome("kayak"));
    }
}