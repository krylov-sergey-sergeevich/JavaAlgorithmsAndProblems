package ru.code.workspace.problems.leetcode.tasks1600;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RichestCustomerWealth1672Test {

    @Test
    public void test_1672() {
        var decision = new RichestCustomerWealth1672();
        assertEquals(24, decision.maximumWealth(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        assertEquals(10, decision.maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}}));
        assertEquals(17, decision.maximumWealth(new int[][]{{2, 8, 7}, {7, 3, 1}, {1, 9, 5}}));
    }

}
