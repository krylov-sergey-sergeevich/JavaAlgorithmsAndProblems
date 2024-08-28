package ru.code.workspace.problems.leetcode.tasks300;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheDifference389Test {

    @Test
    public void test_389() {
        var decision = new FindTheDifference389();
        assertEquals('e', decision.findTheDifference("abcd", "abcde"));
        assertEquals('y', decision.findTheDifference("", "y"));
    }
}
