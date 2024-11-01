package ru.code.workspace.problems.leetcode.tasks800;

import java.util.Arrays;

/**
 * 896. Monotonic Array
 * <p>
 * https://leetcode.com/problems/monotonic-array/
 * <p>
 */
public class MonotonicArray896 {

    public boolean isMonotonic(int[] nums) {
        var limInfMax = nums[0] <= nums[nums.length - 1];
        var limInfMin = nums[0] >= nums[nums.length - 1];
        if (limInfMax && limInfMin) {
            int[] result = nums.clone();
            Arrays.sort(nums);
            return Arrays.equals(result, nums);
        }
        for (int i = 1; i < nums.length; i++) {
            if (
                    (nums[i - 1] >= nums[i] && limInfMin) ||
                            (nums[i - 1] <= nums[i] && limInfMax)
            ) {
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * Влоб, но тоже неплохо.
     */
    public boolean isMonotonic2(int[] nums) {
        if (nums[0] < nums[nums.length - 1]) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

}
