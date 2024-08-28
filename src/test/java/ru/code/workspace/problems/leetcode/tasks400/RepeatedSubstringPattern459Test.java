package ru.code.workspace.problems.leetcode.tasks400;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RepeatedSubstringPattern459Test {

    @Test
    public void test_459() {
        var decision = new RepeatedSubstringPattern459();
        assertTrue(decision.repeatedSubstringPattern("abab"));
        assertTrue(decision.repeatedSubstringPattern("abcabcabcabc"));
        assertFalse(decision.repeatedSubstringPattern("aba"));
        assertFalse(decision.repeatedSubstringPattern("ababba"));
    }

}
