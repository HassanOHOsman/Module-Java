import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;



public class StringUtilitiesTest {

    StringUtilities stringUtilities;

    @BeforeEach
    void setUp() {
        stringUtilities = new StringUtilities();
    }

    @Test
    void testIsPalindrome1(){
        assertTrue(stringUtilities.isPalindrome("mom"), "this word should be palindrome");
        assertTrue(stringUtilities.isPalindrome("B"), "this word should be palindrome"); //edge case
        assertTrue(stringUtilities.isPalindrome(""), "this word should be palindrome");  // edge case
    }

    @ParameterizedTest
    @CsvSource({"RADAR", "dead", "a"})
    void testIsPalindrome2(String s) {
        assertTrue(stringUtilities.isPalindrome(s));
    }






    @Test
    void splitCommaSeparatedLine(){
        assertEquals(List.of("Jan", "Feb", "Mar", "Apr"), stringUtilities.splitCommaSeparatedLine("Jan, Feb, Mar, Apr"), "Comma-separated string should return a list of those strings");
        assertEquals(List.of("Spring - Summer - Autumn - Winter"), stringUtilities.splitCommaSeparatedLine("Spring - Summer - Autumn - Winter"), "Comma-separated string should return a list of those strings"); //edge case
        assertEquals(List.of("  ", "  ", "  ", "  "), stringUtilities.splitCommaSeparatedLine("  ,  ,  ,  "), "Comma-separated string should return a list of those strings");// edge case
    }



}
