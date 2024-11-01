package ru.code.workspace.problems.leetcode.tasks1900;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteCharactersMakeFancyString1957Test {
    @Test
    public void test_1957() {
        var decision = new DeleteCharactersMakeFancyString1957();
        assertEquals("leetcode", decision.makeFancyString("leeetcode"));
        assertEquals("aabaa", decision.makeFancyString("aaabaaaa"));
        assertEquals("aab", decision.makeFancyString("aab"));
    }
}
