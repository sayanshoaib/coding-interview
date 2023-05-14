package leetcode;

// https://leetcode.com/problems/matrix-diagonal-sum/

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        mat[0][0] = 1;
        mat[0][0] = 1;
        mat[0][0] = 1;
        mat[0][0] = 1;
        mat[0][0] = 1;
        mat[0][0] = 1;
        mat[0][0] = 1;
    }

    public int diagonalSum(int[][] mat) {
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            primaryDiagonal += mat[i][i];
        }

        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i != j) {
                secondaryDiagonal += mat[j][i];
            }
            j++;
        }

        return primaryDiagonal + secondaryDiagonal;
    }
}
