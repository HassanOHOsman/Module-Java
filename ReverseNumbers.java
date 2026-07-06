public class ReverseNumbers {

    /**
     * reverseNumber() method takes a number and return its reverse
     * @param number is an integer
     * @return is the reverse of that integer
     */
    private static int reverseNumber(int number) {
        number = Math.abs(number);
        String stringifiedNumber = Integer.toString(number);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = stringifiedNumber.length() - 1; i >= 0 ; i --) {
            stringBuilder.append(stringifiedNumber.charAt(i));

        }

        return Integer.valueOf(stringBuilder.toString());
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(-453));
    }
}
