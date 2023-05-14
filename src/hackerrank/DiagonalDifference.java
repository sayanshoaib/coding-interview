package hackerrank;

// https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true

import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {

    }


    public static int diagonalDifference(List<List<Integer>> arr) {
        int principalDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        // Write your code here
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
              if (i == j)
                  principalDiagonalSum += arr.get(i).get(j);

              if ((i + j) == (arr.size() - 1))
                  secondaryDiagonalSum += arr.get(i).get(j);
            }
        }

        return principalDiagonalSum - secondaryDiagonalSum;
    }
}
