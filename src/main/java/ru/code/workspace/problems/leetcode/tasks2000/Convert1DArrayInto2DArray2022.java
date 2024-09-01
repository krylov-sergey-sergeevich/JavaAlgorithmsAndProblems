package ru.code.workspace.problems.leetcode.tasks2000;

/**
 * 2022. Convert 1D Array Into 2D Array
 *
 * <a href="https://leetcode.com/problems/convert-1d-array-into-2d-array/">url</a>
 */
public class Convert1DArrayInto2DArray2022 {

    public int[][] construct2DArray(int[] original, int m, int n) {
        var index = 0;
        int[][] result = new int[m][n];
        if (original.length < m * n || original.length > m * n) {
            return new int[][]{};
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[index++];
            }
        }
        return result;
    }


}
