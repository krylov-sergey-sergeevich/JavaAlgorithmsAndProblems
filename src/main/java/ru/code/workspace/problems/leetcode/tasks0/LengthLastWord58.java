package ru.code.workspace.problems.leetcode.tasks0;

/**
 * 58. Length of Last Word
 * <a href="https://leetcode.com/problems/length-of-last-word">url</a>
 */
public class LengthLastWord58 {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        Integer start = null;
        Integer end = null;
        while (i >= 0) {
            if (s.charAt(i) != ' ' && start == null) {
                start = i;
            }

            if (s.charAt(i) == ' ' && start != null) {
                end = i + 1;
            }

            if (start != null && end != null) {
                return start - end + 1;
            }
            i -= 1;
        }
        return start + 1;
    }
}
