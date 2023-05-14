package BS23;

import java.util.Scanner;

public class RobotElephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of robot elephant candidates
        double moon_mass = sc.nextDouble(); // mass of the moon

        double max_extravagance = 0;
        String best_elephant = null;

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int complexity = sc.nextInt();
            double mass = sc.nextDouble();

            if (mass >= moon_mass) {
                continue;
            }

            double extravagance = Math.abs(name.length() * complexity);

            if (extravagance > max_extravagance) {
                max_extravagance = extravagance;
                best_elephant = name;
            }
        }

        System.out.println(best_elephant + " to the moon!");

        sc.close();
    }
}


