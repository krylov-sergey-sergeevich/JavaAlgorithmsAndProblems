package ru.code.workspace.problems.leetcode.tasks600;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RobotReturnOrigin657Test {
    @Test
    public void test_657() {
        var decision = new RobotReturnOrigin657();
        assertTrue(decision.judgeCircle("UD"));
        assertFalse(decision.judgeCircle("LL"));
    }
}
