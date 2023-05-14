package leetcode;

import java.util.Arrays;

public class BestTImeToBuyAndSellStock {
    public static void main(String[] args) {
        var prices = new int[]{7, 1, 5, 3, 6, 4};
        var maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

    public static int maxProfit(int[] prices) {
        int leastSoFar = Integer.MAX_VALUE;
        int overallProfit = 0;
        int profitIfSoldToday = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < leastSoFar)
                leastSoFar = prices[i];

            profitIfSoldToday = prices[i] - leastSoFar;
            if (overallProfit < profitIfSoldToday) {
                overallProfit = profitIfSoldToday;
            }
        }

        return overallProfit;
    }
}
