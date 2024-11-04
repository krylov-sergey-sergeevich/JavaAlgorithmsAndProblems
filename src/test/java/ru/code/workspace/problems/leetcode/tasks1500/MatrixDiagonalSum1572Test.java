package ru.code.workspace.problems.leetcode.tasks1500;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixDiagonalSum1572Test {

    @Test
    public void test_1572() {
        var decision = new MatrixDiagonalSum1572();
        assertEquals(25, decision.diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        assertEquals(8, decision.diagonalSum(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}));
    }

}
