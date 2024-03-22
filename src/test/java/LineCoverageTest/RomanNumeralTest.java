package LineCoverageTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import  org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.src.RomanNumeral;

public class RomanNumeralTest {

    @ParameterizedTest
    @CsvSource({
            "1,'I' ",
            "4,'IV'",
            "5,'V'",
            "'9,'IX'",
            "10,'X' "
    })
    public void testToRoman(int input, String expectedOutcome){

        Assertions.assertEquals(expectedOutcome,RomanNumeral.toRoman(input));

    }
}
