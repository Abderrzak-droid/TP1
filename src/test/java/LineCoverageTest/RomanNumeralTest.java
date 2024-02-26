package LineCoverageTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import  org.junit.jupiter.params.provider.CsvFileSource;
import org.src.RomanNumeral;

public class RomanNumeralTest {

    private int input;
    private String expectedOutcome;

    @ParameterizedTest
    @CsvFileSource(resources = "/test-data.csv",numLinesToSkip = 1)
    public void testToRoman(int input, String expectedOutcome){
        this.input = input;
        this.expectedOutcome = expectedOutcome;
        Assertions.assertEquals(expectedOutcome,RomanNumeral.toRoman(input));
    }
}
