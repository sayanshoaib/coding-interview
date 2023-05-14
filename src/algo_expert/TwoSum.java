package algo_expert;

// https://www.algoexpert.io/questions/two-number-sum

import java.util.Arrays;
import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        System.out.println(Arrays.toString(twoNumberSum(array, targetSum)));
        System.out.println(Arrays.toString(twoNumberSumUsingHashTable(array, targetSum)));
        System.out.println(Arrays.toString(twoNumberSumUsingTwoPointers(array, targetSum)));
    }

    // Time Complexity: O(Nlog(N)) | Space Complexity: O(1)
    public static int[] twoNumberSumUsingTwoPointers(int[] array, int targetSum) {
        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (sortedArray[left] + sortedArray[right] == targetSum) {
                return new int[]{sortedArray[right], sortedArray[left]};
            }

            if (sortedArray[left] + sortedArray[right] < targetSum) {
                left++;
            }

            if (sortedArray[left] + sortedArray[right] > targetSum) {
                right--;
            }
        }

        return new int[0];
    }

    // Time Complexity: O(N) | Space Complexity: O(N)
    // x + y = 10
    // => y = 10 - x
    public static int[] twoNumberSumUsingHashTable(int[] array, int targetSum) {
        HashSet<Integer> visitedSet = new HashSet<>();

        for (int num : array) {
            if (visitedSet.contains(targetSum - num)) {
                return new int[]{targetSum - num, num};
            }
            visitedSet.add(num);
        }
        return new int[0];
    }

    // Time Complexity: O(N^2) | Space Complexity: O(1)
    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum)
                    return new int[]{array[i], array[j]};
            }
        }
        return new int[0];
    }
}
