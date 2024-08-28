package ru.code.workspace.problems.leetcode.tasks1700;

/**
 * 1768. Merge Strings Alternately
 * <p>
 * <a href="https://leetcode.com/problems/merge-strings-alternately/description">url</a>
 * <p>
 */
public class MergeStringsAlternately1768 {

    public String mergeAlternately(String word1, String word2) {
        var i = 0;
        var result = new StringBuilder();
        while (i < word1.length() && i < word2.length()) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            i++;
        }
        result.append(word1.substring(i));
        result.append(word2.substring(i));
        return result.toString();
    }
}
