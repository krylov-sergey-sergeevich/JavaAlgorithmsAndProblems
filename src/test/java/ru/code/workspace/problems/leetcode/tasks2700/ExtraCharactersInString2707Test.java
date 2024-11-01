package ru.code.workspace.problems.leetcode.tasks2700;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtraCharactersInString2707Test {

    @Test
    public void test_2707() {
        var decision = new ExtraCharactersInString2707();
        assertEquals(1, decision.minExtraChar("leetscode", new String[]{"leet", "code", "leetcode"}));
        assertEquals(3, decision.minExtraChar("sayhelloworld", new String[]{"hello", "world"}));
    }

}
