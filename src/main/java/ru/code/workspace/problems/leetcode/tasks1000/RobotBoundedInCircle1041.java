package ru.code.workspace.problems.leetcode.tasks1000;

/**
 * 1041. Robot Bounded In Circle
 * <a href="https://leetcode.com/problems/robot-bounded-in-circle">url</a>
 */
public class RobotBoundedInCircle1041 {
    public boolean isRobotBounded(String instructions) {
        int step = 0;
        int d = 1;
        int x = 0;
        int y = 0;
        while (step < Math.pow(10, 3)) {
            int el = step % instructions.length();
            switch (instructions.charAt(el)) {
                case 'G':
                    switch (d) {
                        case 1:
                            y += 1;
                            break;
                        case 2:
                            x -= 1;
                            break;
                        case 3:
                            y -= 1;
                            break;
                        case 4:
                            x += 1;
                            break;
                    }
                    break;
                case 'L':
                    d = switch (d) {
                        case 1 -> 2;
                        case 2 -> 3;
                        case 3 -> 4;
                        case 4 -> 1;
                        default -> throw new IllegalStateException("Unexpected value: " + d);
                    };
                    break;
                case 'R':
                    d = switch (d) {
                        case 1 -> 4;
                        case 2 -> 1;
                        case 3 -> 2;
                        case 4 -> 3;
                        default -> throw new IllegalStateException("Unexpected value: " + d);
                    };
                    break;
            }

            step += 1;
            if (x == 0 && y == 0 && el == instructions.length() - 1) {
                return true;
            }
        }
        return false;
    }
}
