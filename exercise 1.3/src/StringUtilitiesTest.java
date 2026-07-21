import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



public class StringUtilitiesTest {

    StringUtilities stringUtilities;

    @BeforeEach
    void setUp() {
        stringUtilities = new StringUtilities();
    }

    @Test
    void testIsPalindrome(){
        assertTrue(stringUtilities.isPalindrome("mom"), "this word should be palindrome");
        assertTrue(stringUtilities.isPalindrome("B"), "this word should be palindrome"); //edge case
        assertTrue(stringUtilities.isPalindrome(""), "this word should be palindrome");  // edge case
    }

    @Test
    void splitCommaSeparatedLine(){
        assertEquals(List.of("Jan", "Feb", "Mar", "Apr"), stringUtilities.splitCommaSeparatedLine("Jan, Feb, Mar, Apr"), "Comma-separated string should return a list of those strings");
        assertEquals(List.of("Spring - Summer - Autumn - Winter"), stringUtilities.splitCommaSeparatedLine("Spring - Summer - Autumn - Winter"), "Comma-separated string should return a list of those strings"); //edge case
        assertEquals(List.of("  ", "  ", "  ", "  "), stringUtilities.splitCommaSeparatedLine("  ,  ,  ,  "), "Comma-separated string should return a list of those strings");// edge case
    }



}
