package BS23;
import java.util.Scanner;

public class WeddingCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int numCakes = numCompleteCakes(n, a);
        System.out.println(numCakes);
    }

    public static int numCompleteCakes(int n, int[] a) {
        int[] c = new int[n+1];
        c[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (a[i-1] > 0 && i >= 5 && a[i-1] == a[i-5] && c[i-5] > 0) {
                c[i] = c[i-5] + 1;
            } else if (a[i-1] > 0) {
                c[i] = c[i-1];
            } else {
                c[i] = 0;
            }
        }
        return c[n];
    }
}
