package ru.code.workspace.problems.leetcode.tasks1800;

/**
 * 1822. Sign of the Product of an Array
 * <p>
 * https://leetcode.com/problems/sign-of-the-product-of-an-array/
 */
public class SignProductArray1822 {

    public int arraySign(int[] nums) {
        var result = 1;
        for (int num : nums) {
            if (num > 0) {
                result *= 1;
            } else if (num < 0) {
                result *= -1;
            } else {
                return 0;
            }
        }
        return result;
    }


}
