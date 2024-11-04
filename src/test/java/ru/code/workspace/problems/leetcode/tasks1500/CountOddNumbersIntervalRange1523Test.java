package ru.code.workspace.problems.leetcode.tasks1500;

import org.junit.jupiter.api.Test;
import ru.code.workspace.problems.leetcode.tasks0.SetMatrixZeroes73;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CountOddNumbersIntervalRange1523Test {

    @Test
    public void test_73() {
        var decision = new CountOddNumbersIntervalRange1523();

        assertEquals(3, decision.countOdds(3, 7));
        assertEquals(1, decision.countOdds(8, 10));
        assertEquals(1, decision.countOdds(1, 1));
        assertEquals(1, decision.countOdds(0, 1));
        assertEquals(2, decision.countOdds(2, 5));
        assertEquals(2, decision.countOdds(2, 6));
        assertEquals(3, decision.countOdds(1, 6));
    }

}
