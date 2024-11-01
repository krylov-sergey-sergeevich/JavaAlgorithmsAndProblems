package ru.code.workspace.problems.leetcode.tasks1500;

import java.util.Arrays;

/**
 * 1502. Can Make Arithmetic Progression From Sequence
 * <p>
 * https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
 * <p>
 */
public class CanMakeArithmeticProgressionFromSequence1502 {

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i + 1] - arr[i] != arr[i + 2] - arr[i + 1]) {
                return false;
            }
        }
        return true;
    }


}
