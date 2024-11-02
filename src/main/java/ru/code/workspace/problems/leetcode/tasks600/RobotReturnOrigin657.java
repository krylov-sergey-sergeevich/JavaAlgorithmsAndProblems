package ru.code.workspace.problems.leetcode.tasks600;

/**
 * 657. Robot Return to Origin
 * <a href="https://leetcode.com/problems/robot-return-to-origin">url</a>
 */
public class RobotReturnOrigin657 {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U':
                    y += 1;
                    break;
                case 'D':
                    y -= 1;
                    break;
                case 'L':
                    x -= 1;
                    break;
                case 'R':
                    x += 1;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}
