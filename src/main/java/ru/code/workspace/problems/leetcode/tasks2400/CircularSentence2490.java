package ru.code.workspace.problems.leetcode.tasks2400;

/**
 * 2490. Circular Sentence
 * <p>
 * <a href="https://leetcode.com/problems/circular-sentence">url</a>
 * </p>
 */
public class CircularSentence2490 {

    public boolean isCircularSentence(String sentence) {
        String[] data = sentence.split(" ");
        for(int i = 1; i <data.length; i++) {
            if (data[i].charAt(0) != data[i-1].charAt(data[i-1].length() - 1)) {
                return false;
            }
        }
        return data[0].charAt(0) == data[data.length - 1].charAt(data[data.length - 1].length() - 1);
    }

}
