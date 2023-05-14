package BS23;

import java.util.Scanner;

public class CelebratoryCandle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your friend's age: ");
            long age = scanner.nextLong();
            scanner.close();
            int counts = countCandles(age);
            System.out.println(counts);
        }

        public static int countCandles(long age) {
            String ageString = Long.toString(age);
            int[] counts = new int[2]; // Array to store counts of 0-9 candles and 1 candles
            for (char c : ageString.toCharArray()) {
                if (c == '1') {
                    counts[1]++; // Increment count of 1 candles
                } else {
                    counts[0]++; // Increment count of 0-9 candles
                }
            }
            counts[0] -= counts[1]; // Subtract 1 candles from 0-9 candles to get free candles
            return counts[1];
        }

}
