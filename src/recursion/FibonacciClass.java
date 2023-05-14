package recursion;

public class FibonacciClass {

    public static void main(String[] args) {
        int input = 5;
        System.out.println("Fibonacci sequence for the first " + input + " elements is:");

        // Loop to print all the fibonacci sequence elements
        int i = 0;
        while (i < input) {
            System.out.print(fibonacci(i) + " ");
            i++;
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1)
            return 1;

        return fibonacci(n - 1) + fibonacci(n -2);
    }
}
