package ru.code.workspace.problems.leetcode.tasks1300;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfNAndItsDoubleExist1346Test {
    @Test
    public void test_1346() {
        var decision = new CheckIfNAndItsDoubleExist1346();
        assertTrue(decision.checkIfExist(new int[]{10, 2, 5, 3}));
        assertFalse(decision.checkIfExist(new int[]{3, 1, 7, 11}));
    }
}
