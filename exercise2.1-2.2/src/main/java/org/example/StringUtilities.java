import java.util.Arrays;
import java.util.List;

/**
 * Represents a string processor with two methods: one that checks if a string is palindrome, while the other splits a
 * comma-separated string into a list of strings
 *
 * @author Hassan Osman
 * @version 4.0
 * @since 1.0
 * @see StringBuilder
 * @see Arrays
 * @see List
 */
public class StringUtilities {
    public boolean isPalindrome(String s) {

        String reversedString = new StringBuilder(s).reverse().toString();

        return s.equals(reversedString);
    }


    public List<String> splitCommaSeparatedLine(String s) {

        String[] stringsArray = s.split("\\s*,\\s*");


        List<String> stringsList = Arrays.asList(stringsArray);

        return stringsList;

    }
}