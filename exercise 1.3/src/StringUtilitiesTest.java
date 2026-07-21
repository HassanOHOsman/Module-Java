import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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



}
