package ru.code.workspace.problems.leetcode.tasks2000;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Convert1DArrayInto2DArray2022Test {

    @Test
    public void test_2022() {
        var decision = new Convert1DArrayInto2DArray2022();
        assertArrayEquals(new int[][]{{1, 2}, {3, 4}}, decision.construct2DArray(new int[]{1, 2, 3, 4}, 2, 2));
        assertArrayEquals(new int[][]{{1, 2, 3}}, decision.construct2DArray(new int[]{1, 2, 3}, 1, 3));
        assertArrayEquals(new int[][]{}, decision.construct2DArray(new int[]{}, 1, 1));
    }
}
