package ru.code.workspace.problems.leetcode.tasks0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheIndexTheFirstOccurrenceInString28Test {

    @Test
    public void test_28() {
        var decision = new FindTheIndexTheFirstOccurrenceInString28();
        assertEquals(0, decision.strStr("sadbutsad", "sad"));
        assertEquals(-1, decision.strStr("leetcode", "leeto"));
    }

}
