package ru.code.workspace.problems.leetcode.tasks200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagram242Test {

    @Test
    public void test_242() {
        var decision = new ValidAnagram242();
        assertTrue(decision.isAnagram("anagram", "nagaram"));
        assertFalse(decision.isAnagram("rat", "car"));
    }


}
