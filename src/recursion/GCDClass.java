package recursion;

public class GCDClass {

    public static void main(String[] args) {
        var result = gcd(54, 36);
        System.out.println(result);
    }

    public static int gcd(int num1, int num2) {
        if (num1 == num2) {
            return num1;
        }

        if (num1 > num2) {
            return gcd(num1 - num2, num2);
        } else {
            return gcd(num1, num2 - num1);
        }
    }
}
