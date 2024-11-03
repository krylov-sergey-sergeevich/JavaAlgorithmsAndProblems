package ru.code.workspace.problems.leetcode.tasks1500;

/**
 * 1572. Matrix Diagonal Sum
 * <a href="https://leetcode.com/problems/matrix-diagonal-sum">url</a>
 */
public class MatrixDiagonalSum1572 {
    public int diagonalSum(int[][] mat) {
        int result = 0;
        for (int i = 0; i < mat.length; i++) {
            result += mat[i][i];
            if (i != mat.length - 1 - i) {
                result += mat[i][mat.length - 1 - i];
            }
        }
        return result;
    }
}
