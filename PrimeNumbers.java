public class PrimeNumbers {
    // the method prints out all prime numbers between 1 and 1000 (inclusive).

    private static void getPrimeNumbers() {
        for (int i = 1; i <= 1000; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i  % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.println(i);
            }
        }
    }

        static void main(String[] args) {
            getPrimeNumbers();
        }

    }


