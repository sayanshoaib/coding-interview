package subeen_52_problems;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int num = input.nextInt();
            isEvenOrOdd(num);
        }
    }

    public static void isEvenOrOdd(int n) {
        if (n % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
