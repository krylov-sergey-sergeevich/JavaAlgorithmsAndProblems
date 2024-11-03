package ru.code.workspace.problems.leetcode.tasks700;

/**
 * 796. Rotate String
 * <a href="https://leetcode.com/problems/rotate-string">url</a>
 */
public class RotateString796 {

    public boolean rotateString(String s, String goal) {
        for(int i = 0; i < s.length(); i++) {
            if (goal.equals(s.substring(i) + s.substring(0, i))) {
                return true;
            }
        }
        return false;
    }

}
