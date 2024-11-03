package ru.code.workspace.problems.leetcode.tasks700;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RotateString796Test {
    @Test
    public void test_796() {
        var decision = new RotateString796();
        assertTrue(decision.rotateString("abcde", "cdeab"));
        assertFalse(decision.rotateString("abcde", "abced"));
    }
}
