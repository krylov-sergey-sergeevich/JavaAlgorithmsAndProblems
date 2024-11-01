package ru.code.workspace.problems.leetcode.tasks800;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MonotonicArray896Test {

    @Test
    public void test_896() {
        var decision = new MonotonicArray896();
        assertTrue(decision.isMonotonic(new int[]{1, 2, 2, 3}));
        assertTrue(decision.isMonotonic(new int[]{6, 5, 4, 4}));
        assertFalse(decision.isMonotonic(new int[]{1, 3, 2}));
        assertFalse(decision.isMonotonic(new int[]{3, 4, 2, 3}));
        assertFalse(decision.isMonotonic(new int[]{11, 11, 9, 4, 3, 3, 3, 1, -1, -1, 3, 3, 3, 5, 5, 5}));
    }
}
