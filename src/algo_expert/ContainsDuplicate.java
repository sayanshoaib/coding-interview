package algo_expert;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));

    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet distinctNumbers = new HashSet<>();
        if (nums.length == 0)
            return false;

        for (int num : nums) {
            if (distinctNumbers.contains(num))
                return true;
            else
                distinctNumbers.add(num);
        }
        return false;
    }
}
