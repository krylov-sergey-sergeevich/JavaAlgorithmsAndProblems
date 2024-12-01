package ru.code.workspace.problems.leetcode.tasks100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindrome125Test {

    @Test
    public void test_125() {
        var decision = new ValidPalindrome125();
        assertTrue(decision.isPalindrome(".,"));
        assertTrue(decision.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(decision.isPalindrome("race a car"));
        assertTrue(decision.isPalindrome(" "));
    }
}
