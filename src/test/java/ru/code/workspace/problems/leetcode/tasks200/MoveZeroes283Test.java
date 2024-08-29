package ru.code.workspace.problems.leetcode.tasks200;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZeroes283Test {

    @Test
    public void test_283_1() {
        var decision = new MoveZeroes283();
        int[] nums = {0, 1, 0, 3, 12};
        decision.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }


    @Test
    public void test_283_2() {
        var decision = new MoveZeroes283();
        int[] nums = {1, 0};
        decision.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(new int[]{1, 0}, nums);
    }

}
