package ru.code.workspace.problems.leetcode.tasks600;

import java.util.ArrayList;
import java.util.List;

/**
 * 682. Baseball Game
 * <a href="https://leetcode.com/problems/baseball-game">url</a>
 */
public class BaseballGame682 {
    public int calPoints(String[] operations) {
        List<Integer> points = new ArrayList<>();
        for (String op : operations) {
            if (op.equals("+")) {
                points.add(points.getLast() + points.get(points.size() - 2));
            } else if (op.equals("C")) {
                points.removeLast();
            } else if (op.equals("D")) {
                points.add(points.getLast() * 2);
            } else {
                points.add(Integer.parseInt(op));
            }
        }
        return points.stream().mapToInt(Integer::intValue).sum();
    }
}
