package recursion;

public class Josephus {

    public static void main(String[] args) {
        System.out.println("Josephus will be save, if he is the person no: " + killJosephus(10));
//        killJosephus(1000);
    }

    public static int killJosephus(int numberOfPeople) {
        return killJosephus(numberOfPeople, 1);
    }

    private static int killJosephus(int numberOfPeople, int k) {
        if ((int) Math.pow(2.0, k) >= numberOfPeople) {
            return (int) Math.pow(2.0, k - 1);
        }

        return killJosephus(numberOfPeople, k + 1);
    }
}
