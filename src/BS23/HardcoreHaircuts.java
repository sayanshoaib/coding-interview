package BS23;

import java.util.Scanner;
import java.util.Arrays;

public class HardcoreHaircuts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] u = new int[n];
        int[] v = new int[n-1];
        for (int i = 0; i < n; i++) {
            u[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            v[i] = sc.nextInt();
        }
        Arrays.sort(u);
        Arrays.sort(v);
        int index = findHairIndex(u, v);
        if (index == -1) {
            System.out.println("No hair to cut");
        } else {
            int length = v[index] + (u[1] - u[0]);
            int position = Arrays.binarySearch(u, length);
            if (position >= 0) {
                System.out.println(length + " " + (position+1));
            } else {
                System.out.println("No hair to cut");
            }
        }
    }

    public static int findHairIndex(int[] u, int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] - u[i] != u[i+1] - v[i]) {
                return i;
            }
        }
        return -1;
    }
}

