package algo_expert;

import java.util.LinkedList;
import java.util.List;

public class ValidateSubsequence {
    public static void main(String[] args) {
        List<Integer> array = new LinkedList<>(List.of(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence = new LinkedList<>(List.of(5, 1, 25, 22, 6, -1, 8, 10));
        System.out.println(isValidSubsequence(array, sequence));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        for (Integer num : array) {
            if (sequence.contains(num)) {
                sequence.remove(num);
            }

            if (sequence.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    // Time complexity: O(N) | Space complexity : O(1)
    public static boolean isValidSubsequence2(List<Integer> array, List<Integer> sequence) {
        int sequencePointer = 0;
        for (Integer num : array) {
            if (num == sequence.get(sequencePointer)) {
                sequencePointer++;
            }

            if (sequencePointer == sequence.size()) {
                return true;
            }
        }
        return false;
    }

    // Time complexity: O(N) | Space complexity : O(1)
    public static boolean isValidSubsequence3(List<Integer> array, List<Integer> sequence) {
        int arrayPointer = 0;
        int sequencePointer = 0;
        while (arrayPointer < array.size() && sequencePointer < sequence.size()) {
            if (array.get(arrayPointer).equals(sequence.get(sequencePointer))) {
                sequencePointer++;
            }
            arrayPointer++;
            if (sequencePointer == sequence.size()) {
                return true;
            }
        }
        return false;
    }
}
