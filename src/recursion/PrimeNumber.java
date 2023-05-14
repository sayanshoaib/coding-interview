package recursion;

public class PrimeNumber {

    public static void main(String[] args) {
        var result = isPrime(16, 1);
        System.out.println(result);
    }

    public static Object isPrime(int num, int i) {
        // First base case
        if (num < 2) {
            return false;
        }
        // Second base case
        else if (i == 1) {
            return true;
        }
        // Third base case
        else if (num % i == 0) {
            return false;
        }
        else {
            return isPrime(num, i - 1);
        }
    }
}
