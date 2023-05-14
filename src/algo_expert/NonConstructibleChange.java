package algo_expert;

import java.util.Arrays;

public class NonConstructibleChange {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        System.out.println(nonConstructibleChange(coins));
        nonConstructibleChange(coins);
    }

    // Time complexity O(n log(n) + n)
    // Time complexity O(n log(n))
    public static int nonConstructibleChange(int[] coins) {
        if (coins.length == 0) {
            return 1;
        }

        // Time complexity O(n log(n))
        Arrays.sort(coins);
        int minChange = 0;

        // Time complexity O(n)
        for (int coin : coins) {
            if (coin > minChange + 1) {
                break;
            }
            minChange += coin;
        }
        return minChange + 1;
    }
}
