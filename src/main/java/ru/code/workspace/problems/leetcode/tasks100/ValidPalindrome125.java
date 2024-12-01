package ru.code.workspace.problems.leetcode.tasks100;

/**
 * 125. Valid Palindrome
 * https://leetcode.com/problems/valid-palindrome
 */
public class ValidPalindrome125 {
    public boolean isPalindrome(String s) {
        String palidrom = s.toLowerCase();
        int l = 0;
        int r = palidrom.length() - 1;
        while (l < r) {
            while (!isCorrectChar(palidrom.charAt(l)) && l < s.length() - 1) {
                l++;
            }
            while (!isCorrectChar(palidrom.charAt(r)) && r > 0) {
                r--;
            }
            if (l >= r) {
                return true;
            }
            if (palidrom.charAt(l) != palidrom.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    private boolean isCorrectChar(char c) {
        if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9')) {
            return true;
        } else {
            return false;
        }
    }
}
