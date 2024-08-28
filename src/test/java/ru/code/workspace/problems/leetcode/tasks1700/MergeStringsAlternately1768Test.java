package ru.code.workspace.problems.leetcode.tasks1700;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeStringsAlternately1768Test {

    @Test
    void test_1768() {
        var decision = new MergeStringsAlternately1768();
        assertEquals("apbqcr", decision.mergeAlternately("abc", "pqr"));
        assertEquals("apbqrs", decision.mergeAlternately("ab", "pqrs"));
        assertEquals("apbqcd", decision.mergeAlternately("abcd", "pq"));
    }
}
