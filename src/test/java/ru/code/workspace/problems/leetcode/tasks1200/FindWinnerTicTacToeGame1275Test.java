package ru.code.workspace.problems.leetcode.tasks1200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindWinnerTicTacToeGame1275Test {
    @Test
    public void test_1275() {
        var decision = new FindWinnerTicTacToeGame1275();
        assertEquals("Pending", decision.tictactoe(new int[][]{}));
        assertEquals("A", decision.tictactoe(new int[][]{{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}}));
        assertEquals("B", decision.tictactoe(new int[][]{{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}}));
        assertEquals("Draw", decision.tictactoe(new int[][]{{0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1}, {0, 1}, {0, 2}, {2, 2}}));
    }

}
