package LineCoverageTest;

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
    void shouldReturnTrueIfTheWordIsPalindrome(){
        String s = "kayak";
        Assertions.assertTrue(Palindrome.isPalindrome(s));
    }
    @Test
    void shouldReturnFalseIfTheWordIsNotPalindrome(){
        Assertions.assertEquals(false, Palindrome.isPalindrome("pal"));
    }
}