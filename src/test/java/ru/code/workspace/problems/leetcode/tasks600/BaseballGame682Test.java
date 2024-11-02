package ru.code.workspace.problems.leetcode.tasks600;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseballGame682Test {
    @Test
    public void test_682() {
        var decision = new BaseballGame682();
        assertEquals(30, decision.calPoints(new String[]{"5", "2", "C", "D", "+"}));
        assertEquals(27, decision.calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));
        assertEquals(0, decision.calPoints(new String[]{"1", "C"}));
    }
}
