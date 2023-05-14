package recursion;

public class IterativeClass {
    public static void main(String[] args) {
        int input = 1435043;
        int numDigits = countDigits(input);
        System.out.println("Number of digits in " + input + " = " + numDigits);
        int numDigits2 = countDigitsRecursively(input);
        System.out.println("Number of digits recursively in " + input + " = " + numDigits2);
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static int countDigitsRecursively(int num) {
        if (num <= 1) {
            return 1;
        }

        return 1 + countDigitsRecursively(num/10);
    }
}
