package ru.code.workspace.problems.leetcode.tasks2700;

public class ExtraCharactersInString2707 {
    public int minExtraChar(String s, String[] dictionary) {
        int[] data = new int[s.length() + 1];
        for (int i = 1; i <= s.length(); i++) {
            data[i] = data[i - 1] + 1;
            for (String el : dictionary) {
                if (i >= el.length() && s.substring(i - el.length(), i).equals(el)) {
                    data[i] = Math.min(data[i], data[i - el.length()] + 0);
                }
            }
        }
        return data[s.length()];
    }

}
