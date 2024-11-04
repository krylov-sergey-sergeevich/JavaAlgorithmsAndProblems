package ru.code.workspace.problems.leetcode.tasks3100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompressionIII3163Test {

    @Test
    public void test_3100() {
        var decision = new StringCompressionIII3163();
        assertEquals("1a1b1c1d1e", decision.compressedString("abcde"));
        assertEquals("9a5a2b", decision.compressedString("aaaaaaaaaaaaaabb"));
        assertEquals("9a5a2b1c", decision.compressedString("aaaaaaaaaaaaaabbc"));
    }

}
