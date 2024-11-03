package ru.code.workspace.problems.leetcode.tasks1200;

/**
 * 1275. Find Winner on a Tic Tac Toe Game
 * <a href="https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game">url</a>
 */
public class FindWinnerTicTacToeGame1275 {

    public String tictactoe(int[][] moves) {
        int[][] data = new int[3][3];
        for (int i = 0; i < moves.length; i++) {
            int x = moves[i][0];
            int y = moves[i][1];
            if (i % 2 == 0) {
                data[x][y] = 1;
            } else {
                data[x][y] = 2;
            }

            if (isFinishByX(data, x, y)
                    || isFinishByY(data, x, y)
                    || isFinishByD2(data, x, y)
            ) {
                if (i % 2 == 0) {
                    return "A";
                } else {
                    return "B";
                }
            }
        }
        if (moves.length != 9) {
            return "Pending";
        }
        return "Draw";
    }

    public boolean isFinishByX(int[][] moves, int x, int y) {
        boolean result = moves[x][y] == moves[(x + 1) % 3][y] && moves[x][y] == moves[(x + 2) % 3][y] && moves[x][y] != 0;
        return result;
    }

    public boolean isFinishByY(int[][] moves, int x, int y) {
        boolean result = moves[x][y] == moves[x][(y + 1) % 3] && moves[x][y] == moves[x][(y + 2) % 3] && moves[x][y] != 0;
        return result;
    }

    public boolean isFinishByD2(int[][] moves, int x, int y) {
        return (moves[0][0] == moves[1][1] && moves[1][1] == moves[2][2] && moves[1][1] != 0) ||
                (moves[0][2] == moves[1][1] && moves[1][1] == moves[2][0] && moves[1][1] != 0);
    }
}
