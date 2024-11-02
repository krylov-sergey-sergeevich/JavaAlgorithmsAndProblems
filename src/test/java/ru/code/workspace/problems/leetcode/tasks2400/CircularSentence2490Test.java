package ru.code.workspace.problems.leetcode.tasks2400;

import org.junit.jupiter.api.Test;
import ru.code.workspace.problems.leetcode.tasks1900.DeleteCharactersMakeFancyString1957;

import static org.junit.jupiter.api.Assertions.*;

public class CircularSentence2490Test {
    @Test
    public void test_2490() {
        var decision = new CircularSentence2490();
        assertTrue(decision.isCircularSentence("eetcode"));
        assertTrue(decision.isCircularSentence("leetcode exercises sound delightful"));
        assertFalse(decision.isCircularSentence("Leetcode is cool"));
        assertFalse(decision.isCircularSentence("Leetcodec cool"));
    }
}
