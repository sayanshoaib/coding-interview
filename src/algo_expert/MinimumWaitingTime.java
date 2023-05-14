package algo_expert;

import java.util.Arrays;

public class MinimumWaitingTime {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2, 6};
        var res = minimumWaitingTime2(arr);
        System.out.println(res);
    }

    public static int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        int currentSum = 0;
        for (int i = 0; i < queries.length; i++) {
            if (i == 0)
                continue;
            for (int j = 0; j < i; j++) {
                currentSum += queries[j];
            }
        }
        return currentSum;
    }

    public static int minimumWaitingTime2(int[] queries) {
        Arrays.sort(queries);
        int totalWaitingTime = 0;
        for (int i = 0; i < queries.length; i++) {
            var index = i + 1;
            totalWaitingTime += queries[i] * (queries.length - index);
        }
        return totalWaitingTime;
    }
}
