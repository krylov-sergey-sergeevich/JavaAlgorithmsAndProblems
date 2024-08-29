package ru.code.workspace.problems.leetcode.tasks0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PlusOne66Test {

    @Test
    public void test_66_1() {
        var decision = new PlusOne66();
        assertArrayEquals(new int[]{1, 2, 4}, decision.plusOne(new int[]{1, 2, 3}));
    }

    @Test
    public void test_66_2() {
        var decision = new PlusOne66();
        assertArrayEquals(new int[]{4, 3, 2, 2}, decision.plusOne(new int[]{4, 3, 2, 1}));
    }

    @Test
    public void test_66_3() {
        var decision = new PlusOne66();
        assertArrayEquals(new int[]{1, 0}, decision.plusOne(new int[]{9}));
    }

    @Test
    public void test_66_4() {
        var decision = new PlusOne66();
        assertArrayEquals(new int[]{1, 0, 0}, decision.plusOne(new int[]{9, 9}));
    }

    @Test
    public void test_66_5() {
        var decision = new PlusOne66();
        assertArrayEquals(new int[]{9,0,0,0}, decision.plusOne(new int[]{8,9,9,9}));
    }

}
