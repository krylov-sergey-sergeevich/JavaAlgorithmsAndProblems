package ru.code.workspace.problems.leetcode.tasks0;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetMatrixZeroes73Test {
    @Test
    public void test_73() {
        var decision = new SetMatrixZeroes73();

        int[][] m0 = new int[][]{{0, 1}};
        int[][] res0 = new int[][]{{0, 0}};
        decision.setZeroes(m0);
        assertTrue(Objects.deepEquals(m0, res0));


        int[][] m1 = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] res1 = new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        decision.setZeroes(m1);
        assertTrue(Objects.deepEquals(m1, res1));

        System.out.println("******************************");

        int[][] m2 = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][] res2 = new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};
        decision.setZeroes(m2);
        assertTrue(Objects.deepEquals(m2, res2));
    }
}
