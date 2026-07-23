import java.util.Arrays;
import java.util.List;

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