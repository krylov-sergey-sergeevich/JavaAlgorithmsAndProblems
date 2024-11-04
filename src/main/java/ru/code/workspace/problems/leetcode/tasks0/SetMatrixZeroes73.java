package ru.code.workspace.problems.leetcode.tasks0;

/**
 * 73. Set Matrix Zeroes
 * <a href="https://leetcode.com/problems/set-matrix-zeroes">url</a>
 */
public class SetMatrixZeroes73 {
    public void setZeroes(int[][] matrix) {
        boolean[][] zeros = new boolean[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < matrix[i].length; k++) {
                        if (matrix[i][k] != 0) {
                            zeros[i][k] = true;
                        }
                    }
                    for (int k = 0; k < matrix.length; k++) {
                        if (matrix[k][j] != 0) {
                            zeros[k][j] = true;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (zeros[i][j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
