package ru.code.workspace.problems.leetcode.tasks0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthLastWord58Test {
    @Test
    public void test_58() {
        var decision = new LengthLastWord58();
        assertEquals(5, decision.lengthOfLastWord("Hello World"));
        assertEquals(1, decision.lengthOfLastWord(" a "));
        assertEquals(1, decision.lengthOfLastWord("a"));
        assertEquals(4, decision.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, decision.lengthOfLastWord("luffy is still joyboy"));
    }
}
