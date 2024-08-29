package ru.code.workspace.problems.leetcode.tasks0;

import java.util.Arrays;

/**
 * 66. Plus One
 * <p>
 * <a href="https://leetcode.com/problems/plus-one/description">url</a>
 * <p>
 */
public class PlusOne66 {

    public int[] plusOne(int[] digits) {
        var data = new int[digits.length + 1];
        var cum = 0;
        var inc = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int t = digits[i] + inc + cum;
            data[i + 1] = t % 10;
            inc = 0;
            if (t > 9) {
                cum = 1;
            } else {
                cum = 0;
            }
        }
        if (cum > 0) {
            data[0] = 1;
        }
        var result = new int[]{};
        if (data[0] == 0) {
            result = Arrays.copyOfRange(data, 1, data.length);
        } else {
            result = data;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public int[] plusOneBest(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
