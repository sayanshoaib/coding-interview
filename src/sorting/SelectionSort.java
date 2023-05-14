package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {45, 3, 72, 54, 23, 68, 78, 39};
        var newArr = selectionSort(arr);
        for (var a : newArr) {
            System.out.print(a + ", ");
        }
    }

    public static int[] selectionSort(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int smallest = findSmallest(arr);
            newArr[i] = arr[smallest];
            arr = popSmallest(arr, smallest);
        }
        return newArr;
    }

    private static int[] popSmallest(int[] arr, int smallest) {
       for (int i = smallest; i < arr.length - 1; i++) {
           var temp = arr[i];
           arr[i] = arr[i + 1];
           arr[i + 1] = temp;
       }
       arr = Arrays.copyOfRange(arr, 0, arr.length - 1);
       return arr;
    }

    private static int findSmallest(int[] arr) {
        int smallest = arr[0];
        int smallestIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
