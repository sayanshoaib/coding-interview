package grind75;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        twoSum(nums, 6);

    }

    public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            if (nums[start] + nums[end] == target)
                return new int[]{start, end};

            if (nums[start] + nums[end] > target)
                end--;

            if (nums[start] + nums[end] < target)
                start++;
        }
        return new int[]{};
    }
}
