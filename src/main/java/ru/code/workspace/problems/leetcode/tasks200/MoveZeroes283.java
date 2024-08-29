package ru.code.workspace.problems.leetcode.tasks200;

/**
 * 283. Move Zeroes
 * <p>
 * <a href="https://leetcode.com/problems/move-zeroes/">url</a>
 * <p>
 */
public class MoveZeroes283 {

    public void moveZeroes(int[] nums) {
        int iterFirst = 0;
        int iterSecond = 0;
        while (iterSecond < nums.length && iterFirst < nums.length) {
            if (nums[iterFirst] != 0) {
                iterFirst++;
            } else {
                while (nums[iterSecond] == 0 || iterSecond < iterFirst) {
                    iterSecond++;
                    if (iterSecond == nums.length) {
                        return;
                    }
                }
                nums[iterFirst] = nums[iterSecond];
                nums[iterSecond] = 0;
            }
        }
    }

}
