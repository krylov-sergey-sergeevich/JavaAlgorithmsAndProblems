package ru.code.workspace.problems.leetcode.tasks0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanInteger13Test {
    @Test
    public void test_13() {
        var decision = new RomanInteger13();
        assertEquals(3, decision.romanToInt("III"));
        assertEquals(58, decision.romanToInt("LVIII"));
        assertEquals(1994, decision.romanToInt("MCMXCIV"));
    }
}
