import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CheckVowelsTest {
    @ParameterizedTest
    @ValueSource(strings = {"3JHAEOYuqpl8X"})
    @DisplayName("Given string, checks for the vowels and return true.")
    public void inputsWithVowels(String input){
        CheckForVowels obj = new CheckForVowels();
        boolean actual = obj.hasVowels(input);
        Assertions.assertTrue(actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"MNP"})
    @DisplayName("Given string, checks for the vowels and return false.")
    public void inputsWithNoVowels(String input){
        CheckForVowels obj = new CheckForVowels();
        boolean actual = obj.hasVowels(input);
        Assertions.assertFalse(actual);
    }
    @ParameterizedTest
    @NullSource
    @DisplayName("Given null string, return false.")
    public void inputsWithNull(String input){
        CheckForVowels obj = new CheckForVowels();
        boolean actual = obj.hasVowels(input);
        Assertions.assertFalse(actual);
    }
    @ParameterizedTest
    @EmptySource
    @DisplayName("Given empty string, return false.")
    public void inputsWithEmpty(String input){
        CheckForVowels obj = new CheckForVowels();
        boolean actual = obj.hasVowels(input);
        Assertions.assertFalse(actual);
    }
}
