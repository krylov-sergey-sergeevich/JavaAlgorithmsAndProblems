package ru.code.workspace.problems.leetcode.tasks0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpiralMatrix54Test {
    @Test
    public void test_54() throws InterruptedException {
        var decision = new SpiralMatrix54();


        assertEquals(Arrays.asList(1,2,3,4,8,12,16,20,24,23,22,21,17,13,9,5,6,7,11,15,19,18,14,10), decision.spiralOrder(new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}, {17,18,19,20}, {21,22,23,24}}));



        assertEquals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5), decision.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        assertEquals(Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), decision.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
    }

}
