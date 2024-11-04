package ru.code.workspace.problems.leetcode.tasks1500;

/**
 * 1523. Count Odd Numbers in an Interval Range
 * <a href="https://leetcode.com/problems/count-odd-numbers-in-an-interval-range">url</a>
 */
public class CountOddNumbersIntervalRange1523 {

    public int countOdds(int low, int high) {
        return ((high + 1) / 2) - (low) / 2;
    }

}
