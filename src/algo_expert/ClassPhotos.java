package algo_expert;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClassPhotos {
    public static void main(String[] args) {
        List<Integer> redShirtHeights = List.of(5, 8, 1, 3, 4);
        List<Integer> blueShirtHeights = List.of(6, 9, 2, 4, 5 );
        System.out.println(classPhotos(redShirtHeights, blueShirtHeights));
    }

    public static boolean classPhotos(List<Integer> redShirtHeights, List<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);

        int diff = redShirtHeights.get(0) - blueShirtHeights.get(0);
        for (int i = 0; i < redShirtHeights.size(); i++) {
            if ((redShirtHeights.get(i) - blueShirtHeights.get(i)) * diff <= 0) {
                return false;
            }
        }
        
        return true;
    }
}
