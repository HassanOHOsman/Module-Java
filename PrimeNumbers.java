public class PrimeNumbers {
    //
    private static boolean isPrime(int number) {
        for (int j = 2; j < number; j++) {
            if (number  % j == 0) {
                return false;
            }
        }
        return true;
    }

    // the method prints out all prime numbers between 1 and 1000 (inclusive).

    private static void getPrimeNumbers() {
        for (int i = 1; i <= 1000; i++) {


            if (isPrimeNumber) {
                System.out.println(i);
            }
        }
    }

        static void main(String[] args) {
            getPrimeNumbers();
        }

    }


