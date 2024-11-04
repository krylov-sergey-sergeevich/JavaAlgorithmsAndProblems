package ru.code.workspace.problems.leetcode.tasks3100;

/**
 * 3163. String Compression III
 * <a href="https://leetcode.com/problems/string-compression-iii">url</a>
 */
public class StringCompressionIII3163 {
    public String compressedString(String word) {
        if (word.length() == 1) {
            return "1" + word;
        }
        int count = 1;
        StringBuilder res = new StringBuilder();
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                if (count == 9) {
                    res.append("9");
                    res.append(word.charAt(i));
                    count = 1;
                } else {
                    count += 1;
                }
            } else {
                res.append(count);
                res.append(word.charAt(i - 1));
                count = 1;
            }
            if (i == word.length() - 1) {
                res.append(count);
                res.append(word.charAt(i));
            }
        }
        return res.toString();
    }
}
