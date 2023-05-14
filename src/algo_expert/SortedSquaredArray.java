package algo_expert;

import java.util.Arrays;

public class SortedSquaredArray {
    public static void main(String[] args) {
        int[] array = {-2, -1};
        System.out.println(Arrays.toString(sortedSquaredArray(array)));;
    }

    public static int[] sortedSquaredArray(int[] array) {
        int[] squaredArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            squaredArray[i] = array[i] * array[i];
        }
        squaredArray = Arrays.stream(squaredArray).sorted().toArray();
        return squaredArray;
    }
}
