package ru.code.workspace.problems.leetcode.tasks1800;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SignProductArray1822Test {

    @Test
    public void test_1822() {
        var decision = new SignProductArray1822();
        assertEquals(1, decision.arraySign(new int[]{-1, -2, -3, -4, 3, 2, 1}));
        assertEquals(0, decision.arraySign(new int[]{1, 5, 0, 2, -3}));
        assertEquals(-1, decision.arraySign(new int[]{-1, 1, -1, 1, -1}));
    }
}
