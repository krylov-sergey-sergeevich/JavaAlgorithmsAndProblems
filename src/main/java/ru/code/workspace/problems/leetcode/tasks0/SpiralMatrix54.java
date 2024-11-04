package ru.code.workspace.problems.leetcode.tasks0;

import java.util.ArrayList;
import java.util.List;

import static ru.code.workspace.tools.ArrayTool.printBooleanArray;

/**
 * 54. Spiral Matrix
 * <a href="https://leetcode.com/problems/spiral-matrix">url</a>
 */
public class SpiralMatrix54 {
    public enum Direction {
        LEFT, RIGHT, UP, DOWN;
    }

    public List<Integer> spiralOrder(int[][] matrix) throws InterruptedException {
        int n = matrix.length;
        int m = matrix[0].length;
        // n * m

        List<Integer> res = new ArrayList<>();
        boolean[][] visited = new boolean[n][m];
        int x = 0, y = 0;
        Direction direction = Direction.RIGHT;
        while (!visited[x][y]) {
            printBooleanArray(visited);
            System.out.println("---");
            Thread.sleep(500);
            res.add(matrix[x][y]);
            visited[x][y] = true;
            switch (direction) {
                case RIGHT -> {
                    if (y < m - 1 && !visited[x][y + 1]) {
                        y += 1;
                    } else if ((y == m - 1) || visited[x][y + 1]) {
                        direction = Direction.DOWN;
                        if (x < n - 1) {
                            x += 1;
                        }
                    }
                }
                case DOWN -> {
                    if (x < n - 1 && !visited[x + 1][y]) {
                        x += 1;
                    } else if ((x == n - 1) || visited[x + 1][y]) {
                        direction = Direction.LEFT;
                        if (y > 0) {
                            y -= 1;
                        }
                    }
                }
                case LEFT -> {
                    if (y > 0 && !visited[x][y - 1]) {
                        y -= 1;
                    } else if ((y == 0) || visited[x][y - 1]) {
                        direction = Direction.UP;
                        if (x > 0) {
                            x -= 1;
                        }
                    }
                }
                case UP -> {
                    if (x > 0 && !visited[x - 1][y]) {
                        x -= 1;
                    } else if ((x < n - 1) || visited[x + 1][y]) {
                        direction = Direction.RIGHT;
                        if (y < m - 1) {
                            y += 1;
                        }
                    }
                }
            }
            printBooleanArray(visited);
            System.out.println("x: " + x + ", y: " + y + " Direction: " + direction);
            System.out.println("---------------------");
        }
        return res;
    }


}
