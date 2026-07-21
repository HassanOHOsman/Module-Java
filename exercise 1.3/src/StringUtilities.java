public class StringUtilities {
    public boolean isPalindrome(String s) {

        String reversedString = new StringBuilder(s).reverse().toString();

        return s.equals(reversedString);
    }

    @Deprecated
    public List<String> splitCommaSeparatedLine(String s) {}
}