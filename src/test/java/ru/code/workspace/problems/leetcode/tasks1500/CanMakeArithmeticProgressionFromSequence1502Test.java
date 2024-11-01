package ru.code.workspace.problems.leetcode.tasks1500;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CanMakeArithmeticProgressionFromSequence1502Test {

    @Test
    public void test_1502() {
        var decision = new CanMakeArithmeticProgressionFromSequence1502();
        assertFalse(decision.canMakeArithmeticProgression(new int[]{1, 2, 4}));
        assertTrue(decision.canMakeArithmeticProgression(new int[]{3, 5, 1}));
    }
}
