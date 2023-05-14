package recursion;

public class SummationClass {
    public static void main(String[] args) {
        var num = 5;
        System.out.println(sumAll(5));
    }

    public static int sumAll(int num) {
        if (num == 1) {
            return 1;
        }

        return num + sumAll(num - 1);
    }
}
