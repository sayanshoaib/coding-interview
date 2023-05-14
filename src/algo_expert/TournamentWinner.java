package algo_expert;

import java.util.*;

public class TournamentWinner {

    private static String bestTeam = null;
    private static int maxScore = 0;
    private static String currentWinner = null;
    private static Map<String, Integer> scoreboard = new HashMap<>();

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> competition1 = new ArrayList<>(Arrays.asList("HTML", "Java"));
        ArrayList<String> competition2 = new ArrayList<>(Arrays.asList("Java", "Python"));
        ArrayList<String> competition3 = new ArrayList<>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0, 1, 1));

        String champion = tournamentWinner2(competitions, results);
        System.out.println(champion);
        tournamentWinner2(competitions, results);
    };

    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        List<String> winner = new ArrayList<>();
        for (int i = 0; i < results.size(); i++) {
            if (results.get(i) == 1) {
                String team = competitions.get(i).get(0);
                winner.add(team);
            }

            if (results.get(i) == 0) {
                String team = competitions.get(i).get(1);
                winner.add(team);
            }
        }

        Map<String, Integer> scoreboard = new HashMap<>();

        for (String team : winner) {
            if (scoreboard.containsKey(team)) {
                int score = scoreboard.get(team);
                score++;
                scoreboard.put(team, score);
            } else {
                scoreboard.put(team, 1);
            }

        }

        String tournamentChampion = null;
        int maxPoint = 0;

        for (String team : winner) {
            if (maxPoint < scoreboard.get(team)) {
                tournamentChampion = team;
                maxPoint += scoreboard.get(team);
            }
        }
        return tournamentChampion;
    }

    public static String tournamentWinner2(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        for (int i = 0; i < results.size(); i++) {
            if (results.get(i) == 1) {
               currentWinner = competitions.get(i).get(0);
               updateScore(currentWinner);
            }

            if (results.get(i) == 0) {
                currentWinner = competitions.get(i).get(1);
                updateScore(currentWinner);
            }
        }
        return bestTeam;
    }

    private static void updateScore(String currentWinner) {
        if (scoreboard.containsKey(currentWinner)) {
            int score = scoreboard.get(currentWinner);
            score += 3;
            if (score > maxScore) {
                bestTeam = currentWinner;
                maxScore = score;
            }
            scoreboard.put(currentWinner, score);
        } else {
            scoreboard.put(currentWinner, 3);
        }
    }
}
