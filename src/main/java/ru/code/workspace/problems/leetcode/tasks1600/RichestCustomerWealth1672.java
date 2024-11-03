package ru.code.workspace.problems.leetcode.tasks1600;

/**
 * 1672. Richest Customer Wealth
 * <a href="https://leetcode.com/problems/richest-customer-wealth">url</a>
 */
public class RichestCustomerWealth1672 {

    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int[] account : accounts) {
            int t = 0;
            for (int el : account) {
                t += el;
            }
            result = Math.max(result, t);
        }
        return result;
    }

}
