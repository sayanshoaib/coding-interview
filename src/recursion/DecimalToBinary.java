package recursion;

public class DecimalToBinary {

    public static void main(String[] args) {
        var result = convertDecimalToBinary(19);
        System.out.println(result);
    }

    public static int convertDecimalToBinary(int num) {
        if (num == 0)
            return 0;

        return (num % 2 + 10 * convertDecimalToBinary(num / 2));
    }
}
