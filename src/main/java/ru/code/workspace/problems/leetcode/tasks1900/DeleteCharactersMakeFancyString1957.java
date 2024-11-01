package ru.code.workspace.problems.leetcode.tasks1900;

/**
 * 1957. Delete Characters to Make Fancy String
 * <p>
 * <a href="https://leetcode.com/problems/delete-characters-to-make-fancy-string">url</a>
 * </p>
 */
public class DeleteCharactersMakeFancyString1957 {
    public String makeFancyString(String s) {
        if (s.length() < 3) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0, 2));
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i - 2)) {
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
