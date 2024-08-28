package ru.code.workspace.problems.leetcode.tasks300;

import java.util.Arrays;

/**
 * 389. Find the Difference
 * <p>
 * <a href="https://leetcode.com/problems/find-the-difference/description">url</a>
 * <p>
 * Решил за 4 минуты.
 */
public class FindTheDifference389 {

    public char findTheDifference(String s, String t) {
        var x = s.toCharArray();
        var y = t.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        for (int i = 0; i < y.length - 1; i++) {
            if (x[i] != y[i]) {
                return y[i];
            }
        }
        return y[y.length - 1];
    }

}
