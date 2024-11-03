package ru.code.workspace.problems.leetcode.tasks1000;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RobotBoundedInCircle1041Test {

    @Test
    public void test_1041() {
        var decision = new RobotBoundedInCircle1041();
        assertTrue(decision.isRobotBounded("GGLLGG"));
        assertTrue(decision.isRobotBounded("GL"));
        assertFalse(decision.isRobotBounded("GG"));
    }

}
